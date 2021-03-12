fun main() {
    var sum = 0
    do {
        var input = readLine()!!.toInt()
        sum += input
    } while (input != 0)
    println(sum)
}