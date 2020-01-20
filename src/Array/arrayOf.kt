package Array

fun main() {
    var examOne = arrayOf("kardi", "akbar", "aldi")
    examOne[1] ="kardi" //karena variablenya bertipe var maka bisa juga di ubah
    //examOne.get() ="kardi" //karena variablenya bertipe var maka bisa juga di ubah
    //examOne.set()
    println(examOne.toList()) //untuk menampilkan semua isi array
    println(examOne[0]) //untuk menampilkan isi aray yang ingin di lihat


    var dataAngka = intArrayOf(1, 3, 7, 9 , 9, 5, 7)
    dataAngka.average() //nyari rata rata
    println("$dataAngka")

}