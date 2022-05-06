import kotlin.math.roundToInt

fun main() {
    val amount = 1000.0
    val transferMinimum = 35
    if (amount < transferMinimum) {  //always false
        println("Минимумальная сумма перевода ${transferMinimum} рублей")
    } else {
        val commission = calculateCommission(amount)
        val penny = getPenny(commission)
        val money: String = if (penny >= 100) "${penny / 100} р. ${penny % 100} коп." else "$penny коп."
            println("Комиссия составляет: $money")
    }

}

fun calculateCommission(amount: Double): Double {
    val percent = 0.0075
    return percent * amount
}

fun getPenny(amount: Double): Int {
    return (amount * 100).roundToInt()
}
