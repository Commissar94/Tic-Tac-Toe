import java.util.Scanner

fun main() {
    val n = readLine()!!.toInt()
    var max = 0

repeat(n) {
    val scanner = Scanner(System.`in`).nextInt()

    if (scanner % 4 == 0 && scanner > max) {
        max = scanner
    }
}
    println(max)
}
