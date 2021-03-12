fun main() {
    val n = readLine()!!.toInt()
    var positiveNumbers = 0

    repeat(n) {
        if (readLine()!!.toInt() > 0) {
        positiveNumbers += 1
        }
    }

    println(positiveNumbers)
}