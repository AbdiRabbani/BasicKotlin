package com.example.basickotlin

//fun main() {    //Code varaarg
//    val number = sumnumbers(10,20,30,40)
//    println(number)
//}
//
//fun sumnumbers(vararg number: Int): Int {
//    return number.sum()
//}

//fun main() {
//    val arrayNumber = arrayOf(1, 2, 3, 4, 5)
//    println(sumNumber(arrayNumber))
//}
//
//fun sumNumber(number: Array<Int>):Int {
//    return number.sum()
//}
fun main() {                //Gabungan varaarg dan arrayOf
    val number = intArrayOf(10, 20, 30)
    val number1 = sumNumber(10, 20, 30, 40, 50, *number)

    println(sumNumber(number1))
}

fun sumNumber(vararg number: Int  ): Int {
    return number.sum()
}

