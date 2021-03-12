fun main() {
    var n = readLine()!!.toInt()
    print("$n ")

    do {
        if (n % 2 == 0) {
            n /= 2
            print("$n ")
        } else if (n % 2 != 0 && n > 1) {
            n = n * 3 + 1
            print("$n ")
        }

    } while (n != 1 && n > 1)

}