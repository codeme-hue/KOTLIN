package random.fungsi

/**
 * fumgsi dengan parameter dan return type
 * */

fun main() {
    println(Perkalian(3,4)) //memanggil random.fungsi perkalian dan mencetaknya
    val pembagian :Int = Perkalian(13, 2) / angkaBagi(4) //memberikan nilai random.variable
    println(pembagian)
    HelloWorld()
    Nama()

}

//membuat random.fungsi perkalian dengan return type Integer
fun Perkalian(angkaPertama:Int, angkaKedua:Int):Int {

    val hasil:Int = angkaKedua * angkaPertama
    return hasil

}

//membuat random.fungsi pembagian dengan return type Integer
fun angkaBagi(angkaBagi:Int):Int {
    return angkaBagi

}

  //membuat random.fungsi helloworld tanpa parameter dan tanpa pengembalian
fun HelloWorld() {
    print("bismillahitawakkaltualallah")
}

  //random.fungsi tanpa paramter dengan pengembalian
fun Nama():String {
    val  nama:String? = readLine()
    return nama.toString()
}