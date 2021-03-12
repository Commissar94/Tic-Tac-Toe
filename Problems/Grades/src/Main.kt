import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat (scanner.nextInt()-1) {
        when {
            scanner.nextInt() == 5 -> {
                a++
            }
            scanner.nextInt() == 4 -> {
                b++
            }
            scanner.nextInt() == 3 -> {
                c++
            }
            scanner.nextInt() == 2 -> {
                d++
            }
        }
    }
    println("$a $b $c $d")
    }