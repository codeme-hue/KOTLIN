package iokotlin

import java.io.FileReader
import java.io.FileWriter

fun main() {
    println("Enter a message")
    val message :String = readLine().toString() //input keyboard menggunakan readline

    //memeriksa apakah user memasukkan pesan atau tidak
    if (message == "") {
        println("Please enter a message")
    }else{

    }
}

fun readFile() {
    val reader = FileReader("message.txt")
    var char:Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        }while (char != -1)
    }catch (ex: Exception) {
        print(ex.message)
    }
}

/**
 * membuat fungsi menulis to file dengan FileWriter
 * */

fun writeToFile(message:String) {

    try {
        val writer = FileWriter("message.txt", true)
        writer.write(message + "\n")
        writer.close()
    }catch (ex:Exception) {
        println("Exception $ex")
    }
}