package random.oop

fun main() {

    var aku = Data("Kardi haekal")
    aku.copy("Android developer")

    println("Pertama: ${aku.panggil()}")
    print("Kedua: ${aku.panggil()}")

}

data class Data(var data: String) {

    init {
        println("Ini adalah data class")
    }

    fun panggil() = "Panggil data class"
}