package com.example.OOPKotlin

class Hewan(nama : String, berat : Float, berbulu : Boolean) {

    private val nama : String
    val berat : Float
    val berbulu : Boolean
    val umur : Int? = null  //tambah codingan seperti ini untuk menambah val yang tdk eajib di isi namun bisa di isi.

    init {
        this.nama = nama
        this.berat = if (berat <= 0) 0.1F else berat
        this.berbulu = berbulu
    }

    constructor(nama: String, berat: Float, berbulu: Boolean, umur: Int ) : this(nama, berat, berbulu)

    fun makan(){
        println("$nama sedang makan untuk menambah berat badannya")
    }

    fun tidur(){
        println("$nama sedang tidur untuk meerawat bulunya")
    }

    fun info(){ //gunakan private fun untuk mengunci agar fun tdk keluar class
        println("Nama : $nama \nBerat : $berat \nHewan berbulu : $berbulu \nUmur : $umur")
    }
}

fun main() {

    val anjing = Hewan("Bolt", 10.5f, true)
    anjing.makan()

    val kucing = Hewan("Phi", 5.4f, true, 4)
    kucing.info()

}




