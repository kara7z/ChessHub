# Contributing to ChessHub

## Local development

1. Copy `.env.example` to `.env` and fill in distinct local-only values for
   `POSTGRES_PASSWORD` and `CHESSHUB_DB_PASSWORD`. Keep `.env` out of Git.
2. Run `docker compose up --wait` from the repository root.
3. Open `http://127.0.0.1:5173`. Vite forwards `/api` to Spring Boot. The
   backend scaffold returns HTTP 401 until its authentication features exist.

The database port is available only on loopback. Use `CHESSHUB_DB_USER` and
`CHESSHUB_DB_PASSWORD` for application connections; `POSTGRES_PASSWORD` is for
local database administration. PostgreSQL applies its initialization script
only when its data volume is empty. If you change a password after first
startup, update the PostgreSQL role as well as `.env`.

Run `docker compose down` to stop the stack while keeping its PostgreSQL data.
For host builds, use Java 21 and Maven (`mvn -f backend/pom.xml clean verify`)
and Node.js 24 or newer (`npm ci` and `npm run build` in `frontend/`).

## Database migrations

The API runs Flyway against PostgreSQL at startup and Hibernate validates the
schema afterward. Put schema changes in `backend/src/main/resources/db/migration`
as `V<next version>__<description>.sql`. Once a migration is applied, add a new
migration for changes so the recorded checksum stays valid.

The existing scaffold database can apply the initial migration in place if
its schema is empty. Flyway refuses to adopt a nonempty, unversioned schema
automatically; check its contents before deciding how to migrate it. Run
`mvn -f backend/pom.xml verify` with Docker running to exercise migrations
against a temporary PostgreSQL 18 database.

## API errors

API error responses contain `status`, `code`, `message` and `fieldErrors`.
Each field error contains a `field` and a validation `code`. Clients should
branch on `code` rather than the human-readable `message`.

## Branches

`main` is the protected default branch and should stay releasable. Start work
from the current `main` on a short-lived branch for one Jira issue:

```sh
git switch main
git pull --ff-only
git switch -c feature/CHES-123-short-description
```

Use `feature/`, `fix/`, or `chore/` as appropriate. Open pull requests against
`main` with the Jira key in the title. Delete the branch after merging.

## Pull request checks

- Link the Jira issue and summarize the change and how it was verified.
- Run the relevant Maven and frontend build and tests once those projects exist.
  For API changes, verify the affected requests in Postman.
- For behavior changes, check the acceptance criteria and authorization rules.
- Resolve review feedback and fix any failing checks before merging. Request an
  independent review when another contributor is available. For solo changes,
  review the diff and record verification in the PR.

Add required GitHub Actions checks to `main` after [CHES-29] configures CI and
the jobs have run on a pull request.

## Merge policy

Use GitHub's squash merge so each pull request produces one commit on `main`.
Keep the Jira key in the squash commit title. Direct pushes, force pushes, and
deletion of `main` are blocked by branch protection.

[CHES-29]: https://kara-oussama.atlassian.net/browse/CHES-29
