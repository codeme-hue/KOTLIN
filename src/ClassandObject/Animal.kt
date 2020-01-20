package ClassandObject

import java.awt.Color

open class Animal() {
    //deklarasi variable
    var name:String? = null
    var color:String? = null
    var jumlahKaki:Int? = null

    //membuat constructor
    constructor(name:String, color:String, jumlahKaki:Int) : this() {

        this.name = name
        this.color = color
        this.jumlahKaki = jumlahKaki

        //hanya print object saja
        println("Object"+ this.jumlahKaki)
        println("Object"+ this.color)
        println("Object"+ this.name)

    }
}

/**
 * melakukan inheritance atau pewarisan sifat animal dengan hanya menggunakan simbol :(titik dua saja)
 * tidak seperti di java dengan kata kunci extends
 * */

class Kucing():Animal(){

}

fun main() {
    var animal = Animal("ayam", "ijo", 20)
    val kucing = Kucing()
    kucing.jumlahKaki = 7
    print("${kucing.jumlahKaki}")
}