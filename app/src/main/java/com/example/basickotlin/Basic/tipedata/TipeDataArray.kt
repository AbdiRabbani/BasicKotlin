package com.example.basickotlin.Basic.tipedata

fun main() {
    val friends : Array<Any> = arrayOf("budi", "abdi", "jo", "bedul" )

    for (i in friends){
        println(i) }

    println(friends.size) //size ini agar menghitung jumpah data pada arrayof
    println(friends.get(2)) /*get ini di gunakan untuk mengambil salah satu data
    bisa juga langsung tulis angkanya */// kaya gini friends[2]

    friends.set(0,"mobil")  //gunakan set untuk mengganti isi dari pernyataan yang di inginkan
    println(friends[0])

    //size untuk mendapatkan panjang array
    //.get(index) mendapat data di posisi index
    //[index] mendapat data di posisi index
    //.set(index, value) mengubah data di posisi index
    //[index]=value mengubah data di posisi index


//    val name : Array<Any?> = arrayOfNulls(2)
//        name.set(0, null)
//        name.set(1, null)
//
//    for (i in name){
//        println(i)
//    }
//
//    val array = arrayOf("abdi" , "fahri" , "dzakwan")
//    for (i in array){
//        println(i)
//    }

//    array.set(0, "armand")
//    println(array[0])

















}
