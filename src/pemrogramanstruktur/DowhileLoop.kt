package pemrogramanstruktur

fun main() {
    /**
     * do while loop
     * akan melakukan minimal 1 kali tindakan walaupun iya tidak masuk kondisi while
     * */

    var perhitungan:Int = 10

    //melakukan perulangan do
    do {
        println("hitung....... $perhitungan")
        perhitungan -- //pengurangan -1 pada value dalam variable perhitungan
    } while (perhitungan >= 5) //memberikan kondisi pada perhitungan

    println("$perhitungan nilai hitung out of range")
}