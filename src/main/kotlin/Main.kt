import kotlin.math.max

const val ERROR_LIMIT = -1
const val ERROR_TYPE = -2

fun main() {
println(comission("Visa", 10000, 0))
    println(comission("sdsds", 10000, 0))
}

fun comission(cardType: String, amount: Int = 100, previous: Int = 0): Int {
    return when (cardType) {
        "Mir", "Visa", "Mastercard", "Maestro" -> if(amount <= 150_000 && amount + previous <= 600_000) max(35, (amount * 0.0075).toInt()) else ERROR_LIMIT
        else -> ERROR_TYPE
    }
}