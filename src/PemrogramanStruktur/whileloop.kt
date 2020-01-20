package PemrogramanStruktur

fun main() {
    /**
     * while loop(perulangan)
     * increment dan decrement
     * */

    var perhitungan = 4

    //menggunakan perulangan while dengan batas minimal 5
    while (perhitungan >= 5) {
        println("hitung....$perhitungan")
        perhitungan -- //pengurangan -1 pada value dalam variable perhitungan
    }

    println("nilai hitung out of range")
}