fun main() {

    val input = readLine()!!.toCharArray()

    for (i in 'a'..'z') {

        if (i < input[0]) {
            print(i)
            continue
        }
    }
}