package variable

fun main(args: Array<String>) {
    /**
     * Perbedaan antara val dan var
     * kesimpulannya, val adalah cara mendeklarasikan variable yang immutable(tetap/tidak berubah)
     * sedangkan var sebaliknya yaitu value bisa di ubah sewaktu waktu
     * */

    //deklarasi variable dengan val dan var
    val lastName = "kardi haekal" //valuenya tidak dapat di ubah

    var nama:String = "kardi"
    nama = "haekal"  //ketika variable itu var maka valuenya bisa di ubah

    print("Namaku adalah $lastName dan nama panggilanku adalah $nama")
    /**
     * simbol $ dapat digunakan untuk memanggil objek
     * */
}