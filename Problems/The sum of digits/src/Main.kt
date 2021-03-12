fun main() {
    val input = readLine()!!.toInt()
    if (input in 100..999) {

        val a = input / 100
        val b = input / 10 - a * 10
        val c = input - (a * 100 + b * 10)

        println(a + b + c)
    }
}