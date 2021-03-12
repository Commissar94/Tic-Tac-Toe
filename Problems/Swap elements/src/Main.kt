fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()

    val temp = numbers.first()
    numbers[0] = numbers.last()
    numbers[numbers.size - 1] = temp

    println(numbers.joinToString(separator = " "))
}