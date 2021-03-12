fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    var max = 0
    var maxIndex = 0
    for (i in 0..arr.lastIndex) {
        arr[i] = readLine()!!.toInt()
    }

    for (i in 0..arr.lastIndex) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }

        for (i in 0..arr.lastIndex) {
            if (arr[i] == max) {
                maxIndex = i
                break
            }
    }
    println(maxIndex)
}

