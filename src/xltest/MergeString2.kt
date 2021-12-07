package xltest


class MergeString2 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val s1 = "saya"
            val s2 = "kamu"
            println(merge(s1, s2))
        }
        private fun merge(s1: String, s2: String): String? {
            val result = StringBuilder()

            var i = 0
            while (i < s1.length || i < s2.length) {


                // first string if it exists
                if (i < s1.length) result.append(s1[i])

                // Then choose the ith character of the
                // second string if it exists
                if (i < s2.length) result.append(s2[i])
                i++
            }
            return result.toString()
        }

    }
}