package variable

/**
 * variable scope adalah cakupan sebuah variable  akses
 * cakupan variable dibagi menjadi dua yitu lokal dan global
 *
 * variable yang di luar fungsi main, itu disebut dengan variable global
 * */

var Nama:String? = null //luar dari fungsi main

fun main() {
     myName() // memanggil fungsi Variable.getNama
}

 fun myName() {
     Nama = "kardi haekal" //sedangkan yang ini disebut variable lokal
     print("Variable.getNama : $Nama")
 }