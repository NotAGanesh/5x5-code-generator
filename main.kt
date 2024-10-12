import kotlin.random.Random

fun generateCode(): List<String> {
    val allowedChars = "2346789BCDFGHJKMNPQRTVWXYZ"
    val codes = mutableListOf<String>()

    repeat(25) {  // Generate 25 codes
        val code = (1..4).joinToString("-") {
            (1..5).map { allowedChars.random() }.joinToString("")
        } + "-" + (1..4).map { allowedChars.random() }.joinToString("") + "Z"
        codes.add(code)
    }

    return codes
}

// Generate and print 25 codes
fun main() {
    generateCode().forEach { println(it) }
}

