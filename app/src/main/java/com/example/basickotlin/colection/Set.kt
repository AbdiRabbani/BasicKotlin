package com.example.basickotlin.colection

fun main() {
    val integer = setOf(1,1,1,2,2,2,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,9,9,9,9,9,9,)
//    println(integer)   //untuk mengprint angka namun tidak mengprint angka yang ganda

    val setA = setOf(1,2,4,2,1,5)
    val setB = setOf(1,5,7)
    val union = setA.union(setB)
    val intersect = setA.intersect(setB)

//    println(union)
//    println(intersect)
//    println(setA == setB)

    val mutableSet = mutableSetOf(1,2,4,2,1,5)

    mutableSet.add(6)
    mutableSet.remove(1)

    println(mutableSet)
}