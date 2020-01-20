package Fungsi

/**
 * fungsi dibagi menjadi 3 yang pertama itu adalah sebuah fungsi tanpa parameter biasa di sebut prosedur
 * */

fun main() {

    tambah(3, 6)
    LuasSegitiga(5, 2)
}

fun tambah(nomor1:Int, nomor2:Int) {

    val sum:Int = nomor1 + nomor2
    println(sum)

}

fun LuasSegitiga(tinggi:Int, alas:Int) {

    val hitungLuas = tinggi*alas/2
    println("Luas segitiga adalah alas $alas dikali $tinggi dibagi 2 hasilnya $hitungLuas")
}