package com.example.OOPKotlin


//class merupakan sebuah blue print yang terdapat properti dan fungsi di dalamnya

//constactor merupakan semua variabel yang ada di dalam class
//properti merupakan variable di dalam constactor
class Animal(val name : String,
             val weight : Double,
             val age : Int,
             val isMammal : Boolean
){

    var warna = "putih jingga"
    //fungsi
    fun eat(){
        println("$name makan!!")

    }

    fun sleep(){
        println("$name tidur!!")

    }

}