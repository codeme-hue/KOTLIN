package random.trycatch

fun main() {

    var bagi = 10/0   //jika normalnya ini tidak bisa dibagi
    try {
       var bagi = 10/0
        print("10 bisa di bagi 0")
    } catch (e: ArithmeticException) {
        println("10 tidak bisa dibagi")
    }

}