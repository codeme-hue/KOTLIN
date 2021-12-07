package random.oop

fun main(){

    /*var aku = MyClass()
    aku.myBola()
    println("Ini hasilnya ${aku.myBola()}")*/

    MyClass.myBola()



}

class MyClass{
//    fun myBola() = "Bermain bola saat kecil"

    companion object {
        fun myBola() {
         println("Ini adalah bola")
        }
    }
}