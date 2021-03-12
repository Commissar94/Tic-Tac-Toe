fun main() {
    val numbers = readLine()!!.toInt()
    var max = 0
    var max2 = 0
    if (numbers > 1) {

        for (i in 1..numbers){
            var input = readLine()!!.toInt()
            if (input > max){
                 max = input
            } else if (input > max2){
                max2 = input
            }
        }
        val output = max * max2
        println(output)
    } else {
        println(readLine()!!.toInt())
    }
}