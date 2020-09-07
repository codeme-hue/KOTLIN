package operatoroperation

fun main() {

    /*aritmatik pada kotlin*/

    val numberOne = 2
    val numberTwo = 5

    // val result dari perkalian numberOne dan numberTwo
    println("hasil dari perkalian $numberOne dan $numberTwo adalah ${numberOne*numberTwo}")

    //melakukan convert data ke float
    val result:Float = numberOne / numberTwo.toFloat()
    println("hasil pembagian dari $numberOne dan $numberTwo adalah $result")
}