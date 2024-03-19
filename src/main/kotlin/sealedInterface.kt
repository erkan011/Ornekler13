package org.example

sealed interface Product {
    fun displayInfo()
}
data class Laptop(val model: String) : Product{
    override fun displayInfo() {
        println("Laptop Model: $model")
    }
}

data class Phone(val brand: String) : Product {
    override fun displayInfo() {
        println("Phone Brand: $brand")
    }
}

fun main() {
    val laptop = Laptop("lenovo")
    val phone = Phone("Samsung")

    laptop.displayInfo()
    phone.displayInfo()
}