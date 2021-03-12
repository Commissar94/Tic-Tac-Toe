fun main() {
    val input = readLine()!!.toCharArray()

    loop@ for (i in 'a'..'z') {

        for (j in input.indices) {
            if (input[j] == i) {
                continue@loop
            }
        }
        print(i)
    }
}