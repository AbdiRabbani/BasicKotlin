package com.example.OOPKotlin

class orang () {
    var mata = "normal"
    var mulut = true
    var telinga = 2
    var tangan: String? = "kuat"
    var kaki: Int? = 2

    fun melihat(){
        when {
            mata == "normal" -> println("kamu bisa melihat sekitar")
            mata == "abnormal" -> println("maaf mata anda sedang sakit")

            else -> println("code tidak di ketahui")
        }
    }

    fun bersuara(){
        if (mulut == true){
            println("kamu bisa bernyanyi")
        }else if (mulut == false){
            println("beristirahatlah mulutmu sedang sakit")
        }else{
            println("code tidak di ketahui")
        }
    }

    fun mendengar() {
        while (telinga == 2){
            println("kamu bisa mendengar dengan baik")
            telinga--
        }
        if (telinga == 0) {
            println("kamu kekurangan telinga")
        }
    }
    fun menulis(){

    }
    fun berjalan(){

    }
}

fun main() {
    val NU = orang()
    NU.melihat()
    NU.bersuara()
    NU.mendengar()
}