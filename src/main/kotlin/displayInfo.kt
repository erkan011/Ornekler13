package org.example

data class Book (val title: String, val author: String, val papeCount: Int)

fun displayInfo(book: Book){
    println("Kitap Adı: ${book.title}")
    println("Yazar: ${book.author}")
    println("Sayfa Sayısı: ${book.papeCount}")
}

fun main() {
    val mybook = Book("Araba Sevdası", "Erkan Çalışkan", 150)
    displayInfo(mybook)
}