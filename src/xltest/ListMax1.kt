package xltest

import java.util.*

class ListMax1(var n: Int) {
    private val list: MutableList<Int>

    fun doOperation(a: Int, b: Int, k: Int) {
        for (i in a - 1 until b) {
            var `val` = list[i]
            `val` += k
            list[i] = `val`
        }
    }

    fun listMax(): Int {
        list.sort()
        val size = list.size
        return list[size - 1]
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            val str = scanner.nextLine()
            val n = str.split(" ".toRegex()).toTypedArray()[0].toInt()
            val m = str.split(" ".toRegex()).toTypedArray()[1].toInt()
            var opCounter = 0
            val lm = ListMax1(n)
            //If I remember it right these were the constraints for the n and m values.
            if (n in 1..10000000 && m >= 1 && m <= 1000000) {
                while (opCounter != m) {
                    val line = scanner.nextLine()
                    val a = line.split(" ".toRegex()).toTypedArray()[0].toInt()
                    val b = line.split(" ".toRegex()).toTypedArray()[1].toInt()
                    val k = line.split(" ".toRegex()).toTypedArray()[2].toInt()
                    //If I remember it right these were the constraints for the a, b and k values.
                    if (a in 1..n && b >= 1 && b <= n && k >= 1 && k <= 1000000000) {
                        lm.doOperation(a, b, k)
                    }
                    opCounter++
                }
            }
            println("Maximum value in the final list: " + lm.listMax())
        }
    }

    init {
        list = ArrayList(n)
        //Initialize to default value of 0 for all n positions
        for (i in 0 until n) {
            list.add(0)
        }
    }
}