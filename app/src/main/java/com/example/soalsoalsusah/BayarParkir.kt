package com.example.soalsoalsusah

fun main() {

    val jam = 5  //gimana caranya biar saat jamnya di ubah bisa tepat jawabannya
    when(jam){
        in 1..5 -> println("Bayar parkir sebanyak \$${jam * 1.0}") //5 jam pertama bayar 1$
        in 6..23 -> println("Bayar parkir sebanyak \$${((jam-5.0)* 0.5 ) + 0.5}") //jam berikutnya nambah 0,5$
        else -> println("Bayar parkir sebanyak \$${(jam % 24.0) * 0.5 + (jam/24 * 15)}") //setiap 24 jam bayar hanya 15$
    }



//    hitungParkir(46)
//}
//
//fun hitungParkir(waktu: Int){
//    if(waktu >= 0 && waktu <=5){
//        print("Tagihan Parkir sebanyak $${waktu*1}") //blm selesai nulis
//    }else if (waktu > 5 && waktu <= 24){
//        print("Tagihan Parkir sebanyak $${5 + ((waktu - 5) * 0.5)}")
//    }else if (waktu % 24 == 0){
//        print("Tagihan Parkir sebanyak $${(waktu/24) *15}")
//    }else if (waktu > 24){
//        print("")
//    }

}