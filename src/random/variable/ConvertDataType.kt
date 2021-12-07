package random.variable

fun main() {
    /**
     * convert data type from integer to string or float and how to operating then
     * */

    //deklarasi random.variable
    var fistNumber :Int = 15
    var fieldNumber  = 79.4

    //convert type data
    fistNumber = fieldNumber.toInt()
    fieldNumber = fistNumber.toDouble()

    //print
    print("$fistNumber and $fieldNumber")
}