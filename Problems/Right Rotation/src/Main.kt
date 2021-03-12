fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    val newArr = IntArray(n)
    var count = 0

    for (i in 0..arr.lastIndex) {
        arr[i] = readLine()!!.toInt()
    }

    var rightShift = readLine()!!.toInt()
    if (rightShift > n) {
        rightShift %= n
    }

    for (i in 0..newArr.lastIndex) {
        if (i + rightShift < n) {
            newArr[i + rightShift] = arr[i]
        } else {
            newArr [0 + count] = arr[i]
            count++
        }
    }
    for (i in 0..newArr.lastIndex) {
        print("${newArr[i]} ")
    }

}