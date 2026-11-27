package com.chesshub.backend;

import java.sql.SQLException;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.postgresql.PostgreSQLContainer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Testcontainers(disabledWithoutDocker = true)
class MigrationTests {

    @Container
    static final PostgreSQLContainer database = new PostgreSQLContainer("postgres:18");

    @Test
    void migratesFreshSchemaAndUpgradesWithoutChangingExistingData() throws SQLException {
        try (var context = application().run()) {
            assertThat(context.getBean(Flyway.class).info().current().getVersion().getVersion()).isEqualTo("1");
        }
        try (var connection = database.createConnection(""); var statement = connection.createStatement()) {
            statement.executeUpdate("""
                    INSERT INTO accounts (username, email, password_hash, first_name, last_name)
                    VALUES ('newplayer', 'newplayer@example.test', 'test-fixture', 'New', 'Player')
                    """);
            assertThatThrownBy(() -> statement.executeUpdate("""
                    INSERT INTO accounts (username, email, password_hash, first_name, last_name)
                    VALUES ('other', 'NEWPLAYER@EXAMPLE.TEST', 'test-fixture', 'Other', 'Player')
                    """)).isInstanceOf(SQLException.class).extracting("SQLState").isEqualTo("23505");
        }

        try (var context = application().run(
                    "--spring.flyway.locations=classpath:db/migration,classpath:db/upgrade");
                var connection = database.createConnection("");
                var statement = connection.createStatement();
                var result = statement.executeQuery("SELECT username, role, status, avatar_url FROM accounts")) {
            assertThat(context.getBean(Flyway.class).info().applied()).hasSize(2);
            assertThat(result.next()).isTrue();
            assertThat(result.getString("username")).isEqualTo("newplayer");
            assertThat(result.getString("role")).isEqualTo("PLAYER");
            assertThat(result.getString("status")).isEqualTo("PENDING");
            assertThat(result.getString("avatar_url")).isNull();
            assertThat(result.next()).isFalse();
        }
        try (var context = application().run(
                "--spring.flyway.locations=classpath:db/migration,classpath:db/upgrade")) {
            assertThat(context.getBean(Flyway.class).info().applied()).hasSize(2);
        }
    }

    @Test
    void invalidSqlStopsApplicationStartupAndRollsBackMigration() throws SQLException {
        assertThatThrownBy(() -> application().run(
                "--spring.flyway.schemas=invalid_migration",
                "--spring.flyway.locations=classpath:db/migration,classpath:db/invalid"))
                .hasRootCauseInstanceOf(SQLException.class)
                .hasStackTraceContaining("V2__invalid_migration.sql");

        try (var connection = database.createConnection("");
                var statement = connection.createStatement();
                var result = statement.executeQuery("""
                        SELECT success, to_regclass('invalid_migration.rollback_probe') AS probe
                        FROM invalid_migration.flyway_schema_history WHERE version = '1'
                        """)) {
            assertThat(result.next()).isTrue();
            assertThat(result.getBoolean("success")).isTrue();
            assertThat(result.getString("probe")).isNull();
        }
    }

    @Test
    void changedAppliedMigrationStopsApplicationStartup() {
        try (var context = application().run("--spring.flyway.schemas=checksum_validation")) {
            assertThat(context.getBean(Flyway.class).info().current().getVersion().getVersion()).isEqualTo("1");
        }

        assertThatThrownBy(() -> application().run(
                "--spring.flyway.schemas=checksum_validation",
                "--spring.flyway.locations=classpath:db/changed"))
                .hasRootCauseInstanceOf(FlywayException.class)
                .hasStackTraceContaining("Migration checksum mismatch for migration version 1");
    }

    @Test
    void refusesToAdoptAnUnversionedSchemaWithExistingData() throws SQLException {
        try (var connection = database.createConnection(""); var statement = connection.createStatement()) {
            statement.executeUpdate("CREATE SCHEMA unversioned");
            statement.executeUpdate("CREATE TABLE unversioned.existing_data (id integer PRIMARY KEY)");
            statement.executeUpdate("INSERT INTO unversioned.existing_data VALUES (42)");

            assertThatThrownBy(() -> application().run("--spring.flyway.schemas=unversioned"))
                    .hasRootCauseInstanceOf(FlywayException.class)
                    .hasStackTraceContaining("non-empty schema");

            try (var result = statement.executeQuery("""
                    SELECT id, to_regclass('unversioned.flyway_schema_history') AS history
                    FROM unversioned.existing_data
                    """)) {
                assertThat(result.next()).isTrue();
                assertThat(result.getInt("id")).isEqualTo(42);
                assertThat(result.getString("history")).isNull();
            }
        }
    }

    private SpringApplicationBuilder application() {
        return new SpringApplicationBuilder(ChessHubApplication.class)
                .web(WebApplicationType.NONE)
                .properties(
                        "spring.datasource.url=" + database.getJdbcUrl(),
                        "spring.datasource.username=" + database.getUsername(),
                        "spring.datasource.password=" + database.getPassword());
    }
}
