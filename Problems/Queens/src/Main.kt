import kotlin.math.*

fun main() {
    val (x1, y1) = readLine()!!.toString().split(" ")
    val (x2, y2) = readLine()!!.toString().split(" ")

    println (if(x1.toInt() == x2.toInt() || y1.toInt() == y2.toInt()) {
      "YES"
    } else if (abs(x1.toInt() - x2.toInt()) == abs(y1.toInt() - y2.toInt())) {
    "YES"
    } else {
    "NO"
    }
    )
}
