package com.example.basickotlin

fun main() {
    message()

    printmessage("Hello From Lambda")

    val length = messageLenght("Hello Wrold")
    println("Message Lenght $length")

}
      /*bentuk function mesage
        fun message(){
        println("Hello From Lambda")
        }
      */
    //bentuk function di ubah menjadi lambda
val message = { println("Hello From Lambda")}

    //Lambda menggunakan parameter
val printmessage = {pesan : String -> println(pesan)}

val messageLenght = { message : String -> message.length}