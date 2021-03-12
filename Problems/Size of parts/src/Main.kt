fun main() {
    val n = readLine()!!.toInt()
    var larger: Int = 0
    var smaller: Int = 0
    var perfect: Int = 0

    repeat(times = n) {
        var input = readLine()!!.toInt()
        if (input == 0) { perfect++ }
        else if (input == -1) { smaller++ }
        else if (input == 1) { larger++ }
    }
    println("$perfect $larger $smaller")
}