fun main() {
    val (name, lname, age) = readLine()!!.toString().split(" ")

    println("${name[0]}. $lname, $age years old")
}