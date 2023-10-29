fun main() {
    // AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB -> A4B3C2XYZD4E3F3A4B28

    val str = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
    println("$str -> ${countLetter(str)}")
}

fun countLetter(str: String): String {
    var counter = 1
    var result = ""

    for (i in 0..<str.length - 1) {
        if (str[i] == str[i + 1]) {
            counter++
        } else if (counter > 1) {
            result += "${str[i]}$counter"
            counter = 1
        } else {
            result += "${str[i]}"
        }
    }

    result += "${str.last()}"
    if (counter > 1)
        result += "$counter"

    return result
}