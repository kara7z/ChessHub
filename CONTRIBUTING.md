# Contributing to ChessHub

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
