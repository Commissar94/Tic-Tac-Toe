fun main() {
    val time = readLine()!!.toString().split(" ")
    val date = readLine()!!.toString().split(" ")

    println("${time[0]}:${time[1]}:${time[2]} ${date[0]}/${date[1]}/${date[2]}")
}