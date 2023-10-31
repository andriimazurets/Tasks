package Tasks

import kotlin.math.min

fun main() {
    // Given 2 arrays: [1, 2, 3, 2, 0] and [5, 1, 2, 7, 3, 2]
    // We need to return [1, 2, 2, 3] (the order is not important)

    val arrayOne = intArrayOf(1, 2, 3, 2, 0)
    val arrayTwo = intArrayOf(5, 1, 2, 7, 3, 2)

    println(intersectionArray(arrayOne, arrayTwo)) // [1, 2, 3, 2]
    println(intersectionSet(arrayOne, arrayTwo))   // [1, 2, 2, 3]
}

//First solution
fun intersectionArray(arrayOne: IntArray, arrayTwo: IntArray): List<Int> {
    val result = ArrayList<Int>()
    val listOfArrayOne = ArrayList<Int>(arrayOne.toList())
    val listOfArrayTwo = ArrayList<Int>(arrayTwo.toList())

    for (i in listOfArrayOne) {
        if (listOfArrayTwo.contains(i)) {
            listOfArrayTwo.remove(i)
            result.add(i)
        }
    }
    return result
}

// Second solution
fun intersectionSet(arrayOne: IntArray, arrayTwo: IntArray): List<Int> {
    val a1 = arrayOne.toSet()
    val a2 = arrayTwo.toSet()
    val result = mutableListOf<Int>()

    for (i in a1) {
        if (i in a2) {
            val countInArrayOne = arrayOne.count { it == i }
            val countInArrayTwo = arrayTwo.count { it == i }
            result.addAll(List(min(countInArrayOne, countInArrayTwo)) { i })
        }
    }
    return result
}


