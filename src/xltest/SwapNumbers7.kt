package xltest

class SwapNumbers7 {
    companion object {
        @JvmStatic
        fun main(a: Array<String>) {
            var a = 3
            var b = 5
            a += b
            b = a - b
            a -= b
            println(
                "After swaping:"
                        + " a = " + a + ", b = " + b
            )
        }
    }
}
