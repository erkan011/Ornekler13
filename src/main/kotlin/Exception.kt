package org.example

import java.io.File
import java.io.FileNotFoundException

fun main() {
    val filename = "dosya.txt"
    try {
        val fileContent = readFile(filename)
        println("Dosya içeriği: $fileContent")
    } catch (e: FileNotFoundException) {
        println("Hata: Dosya bulunamadı.")
    }
}

fun readFile(filename: String): String {
    val file = File(filename)
    if (!file.exists()) {
        throw FileNotFoundException("Dosya bulunamadı: $filename")
    }
    return file.readText()
}
