fun main() {
    val input1 = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()

    for (i in input1..input2){
        if (i%3==0 && i%5 ==0) {
            println("FizzBuzz")
        } else if (i%3==0){
            println("Fizz")
        } else if (i%5==0){
            println("Buzz")
        } else {
            println(i)
        }
    }
}