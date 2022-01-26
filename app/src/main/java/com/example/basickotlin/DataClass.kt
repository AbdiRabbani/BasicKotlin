package com.example.basickotlin

import android.provider.ContactsContract

class Animal(val name : String, val age : Int){
    override fun toString(): String {       /*override ini di gunakan untuk mengubah si
    Animal yang tadinya hanya code lokasi menjadi String*/
        return "dataAnimal(name=$name)"
    }
}
data class DataAnimal(val name : String, val age : Int)

fun main() {
    val animal = Animal("Tiger", 4)

    val dataAnimal = DataAnimal("Elephant", 5)
    //equals()
    val dataAnimal2 = DataAnimal("Elephant", 5)
    val dataAnimal3 = DataAnimal("cow", 3)
    //copy()
    val dataAnimal4 = dataAnimal3.copy()

//    println(animal)
//    println(dataAnimal)
//
//    println(dataAnimal.equals(dataAnimal2))
//    println(dataAnimal.equals(dataAnimal3))
//
//    println(dataAnimal4)

    //componentN

    val name = dataAnimal.component1()
    val umur = dataAnimal.component2()

    println(name)
}