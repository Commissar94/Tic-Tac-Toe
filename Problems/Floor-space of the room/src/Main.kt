import kotlin.math.sqrt

fun main() {

    when (readLine()!!.toString()) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            val p = (a + b + c) / 2
            println(sqrt(p * (p - a) * (p - b) * (p - c)))
        }
        "circle" -> {
            val a = readLine()!!.toDouble()
            println(3.14 * a * a)
        }
        "rectangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            println(a * b)
        }
    }

}