package com.example.OOPKotlin

open class Animal1 {
    open fun sound(){
        println("Berbagai macam suara binatang")
    }
}

class Duck : Animal1(){
    override fun sound(){
        println("suara bebek : wkwkkw")
    }
}

class Cat : Animal1(){
    override fun sound(){
        println("suara kucing : meaow")
    }
}

fun main() {
    val kucing = Cat()
    val bebek = Duck()

    kucing.sound()
    bebek.sound()
}