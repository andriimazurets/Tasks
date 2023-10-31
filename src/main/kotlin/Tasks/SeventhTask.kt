package Tasks

import java.util.Scanner

// Create an array of 15 integers
// Enter values into it from the keyboard.
// Let the array element index be the house number, and the value be the number of residents living in the house.
// Houses with odd numbers are located at one Side of the Street, and houses with even numbers on the other.
// Find out which side of the street has more residents.
// Display the message: "Houses with odd numbers have more residents."
// or "Houses with even numbers have more residents."
// Note: a house with serial number 0 is considered even
fun main() {
    val array = IntArray(15)
    val scanner = Scanner(System.`in`)
    for (i in 0..14)
        array[i] = scanner.nextInt()

    whereDoYouLiveMore(array)
}

fun whereDoYouLiveMore(array: IntArray) {
    var oddSum = 0
    var evenSum = 0

    for (i in array) {
        if (i % 2 == 0) {
            evenSum += i
        } else {
            oddSum += i
        }
    }

    if (oddSum > evenSum)
        println("Houses with odd numbers have more residents.")
    else if (evenSum > oddSum)
        println("Houses with even numbers have more residents.")
    else
        println("The houses have an equal number of residents.")
}
