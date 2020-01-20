package PemrogramanStruktur

fun main() {

    /**
     * for loop??
     * sebuah perulanagan dengan kata kunci for pada pemrograman kotlin
     * */

    //melakukan perulangan for loop dan mencari angka genap dan ganjil dari 1-100
    for (x :Int in 0..100) {
        if (x % 2 == 0) {
            println("ini angka genap $x")
        } else if (x % 2 != 0) {
            println("ini angka ganjil $x")
        }
    }
}