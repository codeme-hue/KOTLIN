package random.variable

/**
 * random.variable scope adalah cakupan sebuah random.variable  akses
 * cakupan random.variable dibagi menjadi dua yitu lokal dan global
 *
 * random.variable yang di luar random.fungsi main, itu disebut dengan random.variable global
 * */

var Nama:String? = null //luar dari random.fungsi main

fun main() {
     myName() // memanggil random.fungsi Variable.getNama
}

 fun myName() {
     Nama = "kardi haekal" //sedangkan yang ini disebut random.variable lokal
     print("Variable.getNama : $Nama")
 }