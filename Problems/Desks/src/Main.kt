fun main() {

    var input1 = readLine()!!.toInt()
    var input2 = readLine()!!.toInt()
    var input3 = readLine()!!.toInt()

    if (input1 < 1000 && input2 < 1000 && input3 < 1000) {

        input1 += input1 % 2
        input2 += input2 % 2
        input3 += input3 % 2
        println((input1 + input2 + input3) / 2)

    }
}