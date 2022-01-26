package com.example.OOPKotlin

fun main() {
    val cat = Animal("Kucing", 5.4, 4, true)
    println("Nama : ${cat.name}," +
            "Berat : ${cat.weight}," +
            "Umur : ${cat.age}," +
            "Mamalia : ${cat.isMammal}")

    cat.warna
    println("${cat.warna}")
    cat.eat()
    cat.sleep()

}