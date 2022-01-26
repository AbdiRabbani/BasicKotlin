package com.example.OOPKotlin

open class Siswa(val nama : String, protected val berat: Float) {  //menggunakan protected agar tidak bisa di aksess

    fun info(){
        println("Nama : $nama" +
                "Berat : $berat")
    }
}

class SiswaIdn(nama: String,
               berat: Float,
               val jenis : String
               ,val asal : String) : Siswa(nama, berat)


fun main() {
    val pelajar = SiswaIdn("Armand", 50.0f, "Laki-laki", "Jaktim")
    println("Nama Siswa : ${pelajar.nama}")
//    println("Berat siswa :${pelajar.berat}") //akan error jika si value berat di pritected
}