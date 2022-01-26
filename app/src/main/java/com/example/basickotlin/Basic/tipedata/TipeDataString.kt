package com.example.basickotlin.Basic.tipedata

fun main() {
    val name1 = "Abdi"
    val name2 = "Rabbani"
    val alamat = """
        Bumi Teluk Jambe 
        |Perum Perumnas Blok 
        PJ No 10 Jalan Baladewa 4
    """.trimMargin() //Masukkan marginPrefix untuk mencustom simbol
    // Gunakan simbol | untuk merapatkan tulisan ke kiri
    // Ganti trimMargin menjadi trimIndent untuk meratakan semuanya ke kiri

    val fullname = name1 + " " + name2 // Codingan untuk menggabungkan 2 variable
    val fullname2 = "$name1 ${name2.length}" // Length untuk menghitung huruf pada $ tsb
                                            // Uppercase untuk membuat huruf menjadi kapital semua
    println(fullname)
    println(alamat)
}