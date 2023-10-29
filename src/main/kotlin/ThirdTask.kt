fun main() {
    /**
     * Sample Input ["eat","tea","tan","ate","nat","bat"]
     * Sample Output [ ["eat", "tea", "ate"] , ["tan,"nat"] , ["bat"] ]
     */

    val listWord = listOf("eat", "tea", "tan", "ate", "nat", "bat")
    println(groupingByLetters(listWord))
}

fun groupingByLetters(list: List<String>): List<List<String>> {
    val sortedList = mutableListOf<List<String>>()
    val map = mutableMapOf<String, MutableList<String>>()
    for (i in list) {
        val sortedWord = i.toCharArray().sorted().joinToString("")

        if (map.containsKey(sortedWord))
            map[sortedWord]?.add(i)
        else
            map[sortedWord] = mutableListOf(i)
    }

    for ((key, value) in map) {
        sortedList.add(value)
    }

    return sortedList
}