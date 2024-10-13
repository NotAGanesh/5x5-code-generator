import kotlin.random.Random

fun generateCode(): List<String> {
    val allowedChars = "2346789BCDFGHJKMNPQRTVWXYZ"
    val codes = mutableListOf<String>()

    while (codes.size < 25) {
        val codeParts = mutableListOf<String>()

        // Generate the first four parts with 5 characters each
        repeat(4) {
            val part = (1..5)
                .map { allowedChars.random() }
                .joinToString("")
            codeParts.add(part)
        }

        // Generate the last part with 4 characters and append 'Z'
        val lastPart = (1..4)
            .map { allowedChars.random() }
            .joinToString("") + "Z"

        // Join all parts together
        val code = codeParts.joinToString("-") + "-" + lastPart

        // Check for three consecutive repeated characters
        var valid = true
        for (i in 0 until code.length - 6) {
            if (code.substring(i, i + 3) == code.substring(i + 3, i + 6)) {
                valid = false
                break
            }
        }

        // If valid, add to the list of codes
        if (valid) {
            codes.add(code)
        }
    }

    return codes
}

fun main() {
    // Generate and print 25 codes
    generateCode().forEach { println(it) }
}
