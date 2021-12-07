package random.oop

class parent() {
    class iniNested {
        var panggil = "Ini class nested"
    }
}

fun main() {

    println("Ini kelas nested: ${parent.iniNested().panggil}")

}