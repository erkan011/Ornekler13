package org.example

abstract class Animal (val name: String){
    abstract fun makeSound()
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name havlıyor!!")
    }
}

fun main() {
    val dog = Dog("Karabaş")
    dog.makeSound()
}