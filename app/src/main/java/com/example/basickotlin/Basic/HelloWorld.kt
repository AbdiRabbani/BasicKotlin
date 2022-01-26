package com.example.basickotlin.Basic

//Gunakan "const" untuk menulis di luar funtion agar bisa di pakai di berbagai fun/funtion

const val CAR = "SupraMk4" //<--Contoh

fun main() {
    println ("Hello World")

    //val = Tidak bisa di rubah
    //var = Bisa di rubah

    //Tanda '$' Untuk memanggl nama code tsb

    val n  = "Abdi"    //<---Contoh
    val n2 :Int = 5 + 5 //<--Bisa berhitung
    val n3 = "Blok"
    val n4 = "Perumnas jalan baladewa 4"

    println ("Hello My name $n ,I life in $n4 $n3 PJ No $n2") //<-- menggunakan $ untuk di print

    //Int = Angka
    //Float = Desimal
    //Char = Huruf
    //String = Kata


    // Tanda '?' untuk var yg kosong = val name :String?

    var n5 :String? = null //<----Contoh
    n5 ="i like a car ,name is "  //<----untuk mengisi var yang kosong
    print("$n5")

    println(sport()) //<-- untuk mengaktifkan fun 'sport' di bawah
}

fun sport(){
    println(CAR)
}