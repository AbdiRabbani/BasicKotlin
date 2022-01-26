package com.example.OOPKotlin

class mahasiswa7 {
    private var nama = String()
    fun setNama(nama : String){
        this.nama = nama
    }
    fun getNama(): String = nama
}

fun main() {
    val mhs1 = mahasiswa7()
    mhs1.setNama("Abdi")

    println("Hai..., Saya ${mhs1.getNama()}")
    println("Salam Kenal...")
}