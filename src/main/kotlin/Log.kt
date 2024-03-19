package org.example
class Log(private val tag: String){
    fun d(message: String){
        println("$tag : $message")
    }
}
fun divide1(a:Int,b:Int): Int{
    return a/b
}

fun main() {
    val result = try {
        divide1(10,0)
    }catch (e: ArithmeticException){
        println("Hata")
        -1
    }
    println("Sonuç: $result")

    val logger = Log("MyTag")
    val message = "!!Hata!!"

    logger.d(message)
}