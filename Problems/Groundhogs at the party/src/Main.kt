fun main() {
    val reeses: Int = readLine()!!.toInt()
    val weekend: Boolean = readLine()!!.toBoolean()
    var result: Boolean

    if (!weekend && reeses in 10..20) {
        result = true
    } else if (weekend && reeses in 15..25) {
        result = true
    } else { result = false }

    println(result)
}