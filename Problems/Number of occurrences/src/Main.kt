fun main() {
    val inputString = readLine()!!.toString()
    val inputSubstring = readLine()!!.toString()
    val splittedString = inputString.split(inputSubstring)

    println(splittedString.lastIndex)
}