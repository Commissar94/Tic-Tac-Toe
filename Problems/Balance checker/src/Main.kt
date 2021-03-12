import java.util.*

fun main() {
    var userMoney = readLine()!!.toInt()
    val userTransactions = Scanner(System.`in`)
    var price = 0

    while (userTransactions.hasNextInt()) {
        price = userTransactions.nextInt()
        userMoney -= price
    }

    if (userMoney >= 0) {
        println("Thank you for choosing us to manage your account! You have $userMoney money.")
    } else if (userMoney < 0) {
        println("Error, insufficient funds for the purchase. You have ${userMoney + price}, but you need $price.")
    }
}