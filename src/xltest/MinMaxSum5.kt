package xltest

import java.util.*
import kotlin.math.max
import kotlin.math.min

class MinMaxSum5 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val `in` = Scanner(System.`in`)
            var sum: Long = 0
            var max = Long.MIN_VALUE
            var min = Long.MAX_VALUE
            for (i in 0..4) {
                val n: Long = `in`.nextLong()
                sum += n
                max = max(max, n)
                min = min(min, n)
            }
            println((sum - max).toString() + " " + (sum - min))
        }
    }
}