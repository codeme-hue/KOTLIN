package random.oop

fun main() {


}

open class Pertama(nama: String, umur: Int) {

    init {
        println("Nama: $nama, Umur: $umur")
    }

}

class Kedua(nama: String, umur: Int) : Pertama(nama, umur) {

    fun keduaku() {
        println("Kedua function")
    }
}

class Ketiga(nama: String, umur: Int) : Pertama(nama, umur) {

    fun ketiga() {
        println("Ketiga function")
    }
}