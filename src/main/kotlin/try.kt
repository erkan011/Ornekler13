package org.example

import java.text.DecimalFormat

fun divide(a: Int, b: Double): Double {
    return a / b
}

fun main() {
    val result = try {
        divide(10, 4.8)
    } catch (e: ArithmeticException) {
        println("Hata Yakalandı: ${e.message}")
        -1 // Hata durumunda -1 döndür
    }

    val decimalFormat = DecimalFormat("#.##")
    val formattedResult = decimalFormat.format(result)
    println("Format Sonuç: $formattedResult ")

}
