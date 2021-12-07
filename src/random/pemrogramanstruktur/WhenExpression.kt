package random.pemrogramanstruktur

fun main() {
    /**
     * when expression adalah salah satu percabangan dalam pemrograman kotlin
     * dalam bahasa pemrograman lain mirip seperti switch case
     * when expression (switch case) + readline???
     * */

    //aplikasi tebak tebakan umur

    println("saya sekolah di sma negeri satu selong kelas 3 sma tebak umur saya 10 tahun kedepan")
    val jawaban:Int = readLine()!!.toInt() //menggunakan input keyboard

    //umur 21

    /*
    * menggunakan when expression
    * */

    when(jawaban) {
        25 -> print("jawaban kamu salah")
        26 -> print("jawaban kamu masih kurang tepat")
        27 -> print("jawaban kamu masih kurang tepat")
        28 -> print("jawaban kamu masih kurang tepat")
        29 -> print("sedikit lagi kamu benar")
        30 -> print("jawaban kamu benar!!!")
        else -> {
            print("jauh banget tebakan kamu")
        }
    }
}