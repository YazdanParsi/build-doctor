# build-doctor

A small Kotlin command-line tool that reads Jenkins build results through the REST API and tells you **why** builds failed.

Fixing developers' failed builds is part of my daily work as a Jenkins administrator. build-doctor automates the first step: fetch the latest builds of a job, scan their console logs and classify the failure cause, so the right person can act faster.

> Status: work in progress (started October 2026).

## Planned features

- [x] Gradle (Kotlin DSL) project skeleton
- [ ] Fetch the last N builds of a Jenkins job via `/job/<name>/api/json`
- [ ] Download console logs and classify failures with regex (out of memory, test failure, compilation error, timeout, network)
- [ ] Summary table: job, build, result, duration, likely cause
- [ ] Unit tests for the failure classifier
- [ ] TeamCity CI configured with Kotlin DSL (`.teamcity/settings.kts`)
- [ ] Bash helpers: `release.sh` (version tag + release notes from `git log`)
- [ ] Container image, run once on Azure

## Tech stack

Kotlin (JVM 21) · Gradle Kotlin DSL · TeamCity · Bash · Docker · Azure

## Build and run

```bash
gradle build
gradle run --args="--url https://jenkins.example.com --job my-job"
```

## Author

Hossein Khezripour Gharaee – [LinkedIn](https://www.linkedin.com/in/hossein-khezri-)
