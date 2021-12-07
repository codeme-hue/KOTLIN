package xltest

import java.util.*

class FrogJump4 {
    companion object {
        private fun frog(x1: Int, v1: Int, x2: Int, v2: Int): String {
            if (v1 > v2) {
                val remainder = (x1 - x2) % (v2 - v1)
                if (remainder == 0) {
                    return "YES"
                }
            }
            return "NO"
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val `in` = Scanner(System.`in`)
            val x1: Int = `in`.nextInt()
            val v1: Int = `in`.nextInt()
            val x2: Int = `in`.nextInt()
            val v2: Int = `in`.nextInt()
            println(frog(x1, v1, x2, v2))
            `in`.close()
        }
    }
}