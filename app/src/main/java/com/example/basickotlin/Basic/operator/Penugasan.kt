package com.example.basickotlin.Basic.operator

fun main() {

    var x = 10
        x +=10                  //sama aja kaya x = x + 10
        println(x)
    var y = 10
        y -=10
        println(y)
    var z = 10
        z *=10
        println(z)
    var v = 10
        v /=10
        println(v)
    var n = 10
        n %=10
        println(n)

    var a = 10
    var b = 5
    var c = 4
    var d = 9

    a = a + b - c + d
    println(a)
}