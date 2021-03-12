fun main() {
    val inputArray: MutableList<List<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ')
        inputArray.add(strings)
    }

    println(inputArray[2].joinToString())
}