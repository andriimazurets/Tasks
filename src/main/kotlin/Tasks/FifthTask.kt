package Tasks

// The FizzBuzz challenge is a popular problem in technical interviews.
// For a given maximum input value n, create a function that outputs integers from 1 to n.
// But, if an integer is divisible by three, then the number should be replaced with the word “Fizz.”
// Numbers divisible by five should say “Buzz” instead. And numbers divisible by both three and five should say “FizzBuzz.”
// For example, with an input of 17, the output should be:
// [1, 2 , ”Fizz”, 4, “Buzz”, “Fizz”, 7, 8, “Fizz“, “Buzz“, 11, “Fizz”, 13, 14, “FizzBuzz”, 16, 17]
fun main() {
    val number = 17
    println(fizzBuzzFunc(number))
}

fun fizzBuzzFunc(number: Int): List<Any> {
    return (1..number).map {
        when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it
        }
    }
}