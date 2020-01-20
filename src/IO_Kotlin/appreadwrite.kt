package IO_Kotlin

fun main() {
    menu()
}

fun menu() {
    println("Enter:")
    println("1 - Write ")
    println("2 - Read ")
    println("3 - Exit \n")

    var choice:Int = readLine()!!.toInt()
    var message:String?

    when(choice) {
        1 -> {
            println("Enter message")
            message = readLine().toString()
            writeToFile(message)
        }

        2 -> {
            println("Reading...")
            readFile()
        }

        3 -> println("Exiting...")
    }
}
