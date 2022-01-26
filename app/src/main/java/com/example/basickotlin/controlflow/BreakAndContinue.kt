package com.example.basickotlin.controlflow

fun main() {
    var sum = 0         //Break
    var i = 1
    while (i <= 5){
        sum += i
        i++
        if (sum > 10){
            break
        }
        println(sum)
    }




//    var sum = 0
//    var i = 1
//    while (i <= 100) {
//        i++
//        if (i%2 != 0){
//            continue
//        }
//        sum += i
//
//        println(sum)            //kalo di print nya di sini bakal keluatan proses angkanya
//    }
//           //kalo di sini langsung hasil
}