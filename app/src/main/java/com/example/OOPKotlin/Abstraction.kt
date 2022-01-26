package com.example.OOPKotlin

abstract class Computer(){
    abstract fun operatingSyistem() : String
}

class Windows() : Computer(){
    override fun operatingSyistem(): String {
        return "Windows"
    }
}

class Mac() : Computer(){
    override fun operatingSyistem(): String {
        return "Mac"
    }
}

fun getOperatingSyistem(computer: Computer) = computer.operatingSyistem()

fun main() {
    val windows = Windows()
    val mac = Mac()
    println(getOperatingSyistem(windows))
    println(getOperatingSyistem(mac))
}