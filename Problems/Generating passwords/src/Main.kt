import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val uppercaseLetterCount = scanner.nextInt()
    val lowercaseLetterCount = scanner.nextInt()
    val digitCount = scanner.nextInt()
    val totalSymbols = scanner.nextInt()

    val password = CharArray(totalSymbols)
    var index = 0

    val uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val lowercaseLetters = uppercaseLetters.toLowerCase()
    val digits = "0123456789"

    var symbolIndex = 0
    while (symbolIndex < uppercaseLetterCount) {
        password[index] = uppercaseLetters[symbolIndex % 26]
        index++
        symbolIndex++
    }
    symbolIndex = 0

    while (symbolIndex < lowercaseLetterCount) {
        password[index] = lowercaseLetters[symbolIndex % 26]
        index++
        symbolIndex++
    }

    while (index < totalSymbols) {
        password[index] = digits[index % 10]
        index++
    }

    println(password)
}
