package random.oop

fun main() {

    //function dengan objek
    var obj = MyFather()
    obj.bola()

    //Function objek dengan parameter
    var objParams = MyFather()
    objParams.params(23)

    class Person(apa: String) {
        var apaan = apa

        //init digunakan untuk mengaktifkan konstruktor ataupun yang lainnya
        init {
            println("Ini adalah konstruktor kotlin $apaan")
        }
    }
}