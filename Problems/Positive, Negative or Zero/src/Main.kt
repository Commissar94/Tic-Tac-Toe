fun main() {
    val input = readLine()!!.toInt()
    if (input < 0) {
        println("negative")
    } else if (input > 0) {
        println("positive")
    } else {
        println("zero")
    }
}