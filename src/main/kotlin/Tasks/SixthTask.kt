package Tasks

import java.util.Scanner

// Steps
// For a given integer input n, create a function that returns a string output of generated steps using the # character.
// For example, for an input of 3, the output should look like:
//‘#‘
//‘##’
//‘###’
fun main() {
    val num = Scanner(System.`in`)
    println(stepBuilder(num.nextInt()))
}

fun stepBuilder(num: Int) {
    var str = "#"
    repeat(num) {
        println(str)
        str += "#"
    }
}