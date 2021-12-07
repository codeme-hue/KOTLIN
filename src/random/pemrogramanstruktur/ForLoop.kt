package random.pemrogramanstruktur

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

    //Menghitung in(dari) 1 sampai dengan 7
    //Jika 7 ke satu bukan menggunakan ini
    for(x in 1..7) {
        print(x)
    }

    //Menghitung dari kecil ke besar
    for (x in 5 downTo 1) {
        print(x)
    }


    //Kata kunci step(selisih)
    for (c in 10 downTo 1 step 3) {
        print(c)
    }
}