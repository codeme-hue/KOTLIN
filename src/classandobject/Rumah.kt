package classandobject

/**
 * membuat sebuah class rumah dengan beberapa parameter
 * */

class Rumah(var tipe:String, val harga:Double, val tahunPembanguna:Int, val pemilik:String) {

    /*
    * melakukan inisialisasi class rumah
    * */

    init {
        this.tipe
        this.harga
        this.tahunPembanguna
        this.pemilik
    }

    /**
     *getters and setters adalah sebuah optioanl pada kotlin tidak seperti java
     * membuat getters and setters adalah bad programming pada kotlin
     * kotlin menginginkan kita untuk selalu menggunakan properties untuk mengakses dan set class
     * */
}
fun main() {
    /**
     * membuat sebuah objek Rumah
     * */

    val rumah = Rumah("Mewah", 20000000.0, 2021, "M Sukardi Haekal")

    //mencetak sebuah object rumah
    print("rumah ${rumah.pemilik} tahun pembanguna ${rumah.tahunPembanguna} dengan harga ${rumah.harga} tipe ${rumah.tipe}")

}