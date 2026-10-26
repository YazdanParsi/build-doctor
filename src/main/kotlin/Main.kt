// build-doctor: diagnose why Jenkins builds failed.
// Entry point. Next steps: fetch builds from the Jenkins REST API and classify failures.

fun main(args: Array<String>) {
    val options = parseArgs(args)
    val url = options["--url"]
    val job = options["--job"]

    if (url == null || job == null) {
        println("Usage: build-doctor --url <jenkins-url> --job <job-name>")
        return
    }

    println("build-doctor: checking job '$job' on $url")
    // TODO: fetch the last builds from $url/job/$job/api/json
    // TODO: download console logs and classify the failure cause
}

fun parseArgs(args: Array<String>): Map<String, String> =
    args.toList()
        .chunked(2)
        .filter { it.size == 2 }
        .associate { it[0] to it[1] }
