package com.example.soalsoalsusah


//fun main() {
//
//    var sum = 0
//    var i = 1
//    while (i <= 20) {
//        i++
//        if (i%3 == 0) {
//            println("idn")
//        }
//        sum += i
//
//        println(sum)            //kalo di print nya di sini bakal keluatan proses angkanya
//    }
//}

//fun main() {
//    val array = arrayOf(
//    "2020/2021",
//    "Ajaran",
//    "Bidang",
//    "Tahun",
//    "RPL",
//    "Boarding School",
//    "Android",
//    "IDN",
//    "Developer",
//    "SMK"
//    )
//        print(array[9] + " ")
//        print(array[7] + " ")
//        print(array[5] + " ")
//        print(array[3] + " ")
//        print(array[1] + " ")
//        print(array[0] + " ")
//        print(array[2] + " ")
//        print(array[6] + " ")
//        print(array[8])
//
//}

//class Pemain(val name :String, val age :Int){
//    override fun toString(): String {
//        return "PemainBola(name=$name, umur=$age)"
//    }
//}
//data class PemainBola(val name:String, val umur :Int)
//
//
//fun main() {
//
//    val pemain = Pemain("Riko Simanjuntak", 28)
//    val pemain2 = PemainBola("Riko Simanjuntak", 28)
//
//    println(pemain)
//    println(pemain2)
//}


//class Data(val name :String, val age :Int, val country :String){
//    override fun toString(): String {
//        return "[name=$name, umur=$age, negara=$country]"
//    }
//}
//fun main() {
//
//    val data = Data("Michael",20, "USA" )
//    val data1 = Data("Hygra", 22, "Cambodia")
//    val dat2 = Data("Slovoski", 21, "Russia")
//    val data3 = Data("Mohamad", 19, "Indonesia")
//
//
//}


//fun main() {
//    calculator(1, '+', 1)
//    calculator(1, 'a', 1)
//}
//
//// TODO 1 Lengkapi fungsi berikut dengan program yang dapat menghitung operator
//// penjumlahan +
//// pengurangan -
//// pembagian /
//// perkalian *
//// modulus %
//
//fun calculator(numb : Int, char : Char, numb1 : Int) {
//    // TODO 2 Buat kondisi jika operator yang diinputkan salah
//    // maka cetak text berikut sebagai output
//    // "Operator tidak dikenali program"
//
//
//    when(char){
//
//        '+' -> println("1 + 1 =2")
//        '-' -> println("1 - 1 =0")
//        '/' -> println("1 / 1 =1")
//        '*' -> println("1 * 1 =1")
//        '%' -> println("1 % 1 =0")
//
//        else -> print("Operator tidak dikenali program")
//
//    }
//}
//
//// ekspektasi output:
//// 1 + 1 = 2
//// Operator tidak dikenali program

fun main() {

    var num = 0
    var i = 0
    var r = "\"idn\""

    while (i <= 19) {
        i++
        if (i%3 != 0 && i%2 == 1)
            print(r)
        else{
            print("," + "$i")
        }
    }
        num += i

}








