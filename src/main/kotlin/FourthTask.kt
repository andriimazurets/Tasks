// The longest word
//For a given input string of words, create a function that returns the longest word in the string.
//For example, for the input phrase “I love Google.” the output should be “Google”.
// For an added challenge, you can create an output that lists the longest word along with the number of characters in the word.
// So, for the string “I love Google...” the output would look something like, “word: Google count: 6.”
fun main() {
    val string = "I love Google..."
    println(stringProcessing(string))
}

fun stringProcessing(str: String): String {
    val currentWord = mutableListOf<Char>()
    val maxWord = mutableListOf<Char>()

    str.forEach {
        if (it.isLetter()){
            currentWord += it
        } else {
            if (maxWord.size < currentWord.size){
                maxWord.clear()
                maxWord.addAll(currentWord)
            }
            currentWord.clear()
        }
    }

    if (maxWord.size < currentWord.size){
        maxWord.clear()
        maxWord.addAll(currentWord)
    }

    return "word: $maxWord count: ${maxWord.size}."
}