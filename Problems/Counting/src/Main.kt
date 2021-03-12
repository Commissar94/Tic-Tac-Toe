fun main() {
    val numbers = readLine()!!.toInt()
    val nArray = IntArray(numbers)

    for (i in 0..nArray.lastIndex) {
        nArray[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    var useOfM = 0

    for (i in 0..nArray.lastIndex) {
        if (nArray[i] == m) {
        useOfM++
        }
    }
    println(useOfM)
}