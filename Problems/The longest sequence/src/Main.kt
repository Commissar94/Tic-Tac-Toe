fun main() {
    val numbers = readLine()!!.toInt()
    var combo = 0
    var maxCombo = 0
    var maxNumber = 0

    for (i in 1..numbers){
    var input = readLine()!!.toInt()
    if (input > maxNumber){
        maxCombo=++combo
        maxNumber = input
    } else if (input == maxNumber){
      maxCombo = combo
    } else {
        if (combo > maxCombo) {
            maxCombo = combo
            combo = 0
        }
    }
    }
    println(maxCombo)
}