fun main() {

    val input1 = readLine()!!.toString()
    val input2 = readLine()!!.toString()
    val input3 = readLine()!!.toString()

    println(
        when (input2) {
            "equals" -> input1 == input3
            "plus" -> input1 + input3
            "endsWith" -> input1.endsWith(input3)
            else -> "Unknown operation"
        }
    )
}