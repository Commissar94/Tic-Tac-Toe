fun main() {
    val a = readLine()!!
    val b = readLine()!!
    val c = readLine()!!

    val result: Boolean = !(a == b || a == c || b == c)
    println(result)
}