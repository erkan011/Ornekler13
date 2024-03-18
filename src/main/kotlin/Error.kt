package org.example

fun bolme(a:Int,b:Int): Int{

    if (b == 0){
        throw ArithmeticException("Bölen Sıfır Olmaz!!")
    }
    return a/b
}
fun main() {
    try {
        val sonuc = bolme(10 , 0)
        println("Sonuç: $sonuc")
    }catch (e: ArithmeticException){
        println("Hata: ${e.message}")
    }
}