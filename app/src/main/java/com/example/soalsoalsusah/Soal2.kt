package com.example.soalsoalsusah


open class IDN(
    var mata_pelajaran: ArrayList<String>,
    var jam_pelajaran: ArrayList<Int>,
    var pengajar: ArrayList<String>,){


    fun cetak_mp(){
        println(mata_pelajaran)
    }

    fun cetak_jp(){
        println(jam_pelajaran)

    }

    fun cetak_pengajar(){
        println(pengajar)

    }
}

class InputData :IDN(
    arrayListOf("db", "web", "android", "diniyyah", "adab", "quran hadis", "akhlak", "tahfidz"),
    arrayListOf(6, 7, 8, 9, 10, 11, 12, 13, 14, 15),
    arrayListOf("adi", "nugroho", "fusilat", "argo", "sekar", "tanjung", "bunga", "melati", "dea", "aini")
) {


    fun all(){
        val  guru = pengajar[1]
        val jam = jam_pelajaran[3]
        val mapel = mata_pelajaran[3]

        val text = "$guru mengajar di jam ke $jam pada mata pelajaran $mapel"

        println(text)
    }
}

fun main() {

    val print = InputData()
    print.all()
}