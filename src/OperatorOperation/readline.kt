package OperatorOperation

fun main() {

    /**
     *   readline adalah input pada kotlin yang digunakan untuk menyimpan value pada variable
     * menggunakan input keyboard
     * */

    println("Siapakah nama kamu")
    //menginput user dengan input keyboard (readline)
    val user:String? = readLine()


    println("Dimanakah alamatmu kamu")
    //menginput user dengan input keyboard (readline)
    val addres:String? = readLine()


    println("dan status mu saat ini")
    //menginput user dengan input keyboard (readline)
    val status:String? = readLine()


    println("Nama kamu adalah $user, alamatmu di $addres dan status mu saat ini adalah $status")
}