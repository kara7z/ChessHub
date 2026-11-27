#!/bin/sh
set -eu

psql -X --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" --set=ON_ERROR_STOP=1 <<'SQL'
\getenv app_user CHESSHUB_DB_USER
\getenv app_password CHESSHUB_DB_PASSWORD
\getenv app_database POSTGRES_DB

CREATE ROLE :"app_user" LOGIN PASSWORD :'app_password';
REVOKE CONNECT ON DATABASE :"app_database" FROM PUBLIC;
GRANT CONNECT ON DATABASE :"app_database" TO :"app_user";
GRANT USAGE, CREATE ON SCHEMA public TO :"app_user";
SQL
