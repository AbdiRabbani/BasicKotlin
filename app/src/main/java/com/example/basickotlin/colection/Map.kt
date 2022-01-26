package com.example.basickotlin.colection

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to  "England",
        "Tokyo" to "Japan"
    )

    println(capital["Tokyo"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys  //untuk memprint sang kata kunci
    val mapValue = capital.values  //untuk memprint sang value

    println(mapKeys)
    println(mapValue)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amserdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)
}