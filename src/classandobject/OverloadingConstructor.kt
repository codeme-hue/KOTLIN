package classandobject

/**
 * overloading itu adalah membuat constructor lebih dari satu
 * dengan tujuan apabila kita ingin menggunakan beberapa parameter dari constructor utama
 * */

class kendaraan() {
    //set properties
    var nama: String? = null
    var roda: String? = null
    var sayap: Int? = null
    var warna:String? = null

    /*
    * membuat constructor dengan 4 parameter
    * constructor utama
    * */

    constructor(nama:String, roda:String, sayap:Int, warna:String):this() {

        this.nama = nama
        this.roda = roda
        this.sayap = sayap
        this.warna = warna

        println("object : "+ this.nama)
        println("object : "+ this.roda)
        println("object : "+ this.sayap)
        println("object : "+ this.warna)
    }

    /*
   * membuat constructor dengan 3 parameter
   * */
    constructor(roda:String, sayap:Int, warna:String):this() {

        this.roda = roda
        this.sayap = sayap
        this.warna = warna

        println("object : "+ this.roda)
        println("object : "+ this.sayap)
        println("object : "+ this.warna)
    }

    /*
  * membuat constructor dengan 2 parameter
  * */
    constructor(sayap:Int, warna:String):this() {

        this.sayap = sayap
        this.warna = warna

        println("object : "+ this.sayap)
        println("object : "+ this.warna)
    }
}

fun main() {
    var becak  = kendaraan(1, "biru")
    var garudaAir = kendaraan("besar", 2,"biru")
    var lamborghini = kendaraan("mobil","roda razor", 2, "warna hijau")
}