fun main() {
    val input = readLine()!!.toCharArray()
    var repeats = 0
    val indexes = input.indices

    loop@ for (i in indexes) {

        for (j in indexes) {

            if (input[i] == input[j] && i != j) {
                repeats++
                continue@loop
            }

        }
    }

    println(input.size - repeats)
}
