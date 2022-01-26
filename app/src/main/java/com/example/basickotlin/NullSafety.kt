package com.example.basickotlin

fun main() {
    val b =  2006     //Membuat null dan melakukan pengecekan dengan if else
    if (b != null){   //code untuk mengecek apakah si b adalah null atau bukan
        println(b)
    }else{
        println("variabel b adalah null")
    }
                           // Cara ke 2 dalam mengatasi masalah null
    var c : String? = null
        println(c?.length) //gunakan tanda ? pada var(c) untuk memprint null

    val d : String? = "adx"
    if (d !=null) {
        println(d?.length)
    }else{
        println(-1)
    }

    val l : Int = if (d !=null)d.length else -1 //cara lebih singkat
    println(l)

    val t = d?.length ?: -1 //cara paling singkat
    println(t)

//    val s = String? = null  //!! adalah tanda elvis operator untuk pemaksaan jika yakin
//    bahwa data tsb bukan merupakan null

//    println(s!!.length)





}
