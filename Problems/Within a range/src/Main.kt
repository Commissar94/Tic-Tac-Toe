fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val e = readLine()!!.toInt()

    val range1 = a..b
    val range2 = c..d

    println(e in range1 || e in range2)
}