package org.example

sealed class Hayvan{
    class kedi(val isim: String): Hayvan()
    class kopek (val isim: String): Hayvan()
}

fun sesCikar(hayvan: Hayvan) {
    val ses = when (hayvan) {
        is Hayvan.kedi -> "${hayvan.isim} miyavv"
        is Hayvan.kopek -> "${hayvan.isim} hav hav"
    }
    println(ses)
}
fun main() {
    val Kedi = Hayvan.kedi("Minnoş: ")
    val Kopek = Hayvan.kopek("Karabaş: ")

    sesCikar(Kedi)
    sesCikar(Kopek)
}