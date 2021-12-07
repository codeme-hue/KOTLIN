package xltest

import java.util.*
import kotlin.collections.ArrayList

class MorganAndString3 {
    companion object {
        private const val MAXSIZE = 200100
        private const val ALPHABET = 128

        @JvmStatic
        fun main(args: Array<String>) {
            val `in` = Scanner(System.`in`)
            val testcase: Int = `in`.nextLine().toInt()
            for (i in 0 until testcase) {
                val str1: String = `in`.nextLine()
                val str2: String = `in`.nextLine()
                println(solution(str1 + "a", str2 + "b"))
            }
        }

        private fun buildSuffixArray(str: String): List<Int> {
            val p = IntArray(MAXSIZE)
            val c = IntArray(MAXSIZE)
            val cnt = IntArray(MAXSIZE)
            val pn = IntArray(MAXSIZE)
            val cn = IntArray(MAXSIZE)
            Arrays.fill(cnt, 0)
            val n = str.length
            for (i in 0 until n) {
                ++cnt[str[i].toInt()]
            }
            for (i in 1 until ALPHABET) {
                cnt[i] += cnt[i - 1]
            }
            for (i in 0 until n) {
                p[--cnt[str[i].toInt()]] = i
            }
            var count = 1
            c[p[0]] = count - 1
            for (i in 1 until n) {
                if (str[p[i]] != str[p[i - 1]]) {
                    ++count
                }
                c[p[i]] = count - 1
            }
            var h = 0
            while (1 shl h < n) {
                for (i in 0 until n) {
                    pn[i] = p[i] - (1 shl h)
                    if (pn[i] < 0) {
                        pn[i] += n
                    }
                }
                Arrays.fill(cnt, 0)
                for (i in 0 until n) {
                    ++cnt[c[i]]
                }
                for (i in 1 until count) {
                    cnt[i] += cnt[i - 1]
                }
                for (i in n - 1 downTo 0) {
                    p[--cnt[c[pn[i]]]] = pn[i]
                }
                count = 1
                cn[p[0]] = count - 1
                for (i in 1 until n) {
                    val pos1 = (p[i] + (1 shl h)) % n
                    val pos2 = (p[i - 1] + (1 shl h)) % n
                    if (c[p[i]] != c[p[i - 1]] || c[pos1] != c[pos2]) {
                        ++count
                    }
                    cn[p[i]] = count - 1
                }
                for (i in 0 until n) {
                    c[i] = cn[i]
                }
                ++h
            }
            val res: MutableList<Int> = ArrayList(n)
            for (i in 0 until n) {
                res.add(c[i])
            }
            return res
        }

        private fun solution(str1: String, str2: String): String {
            val sb = StringBuilder(str1).append(str2)
            val suffix = buildSuffixArray(sb.toString())
            val rst = StringBuilder()
            var start1 = 0
            var start2 = 0
            while (start1 < str1.length - 1 || start2 < str2.length - 1) {
                if (start1 >= str1.length - 1) {
                    rst.append(str2[start2++])
                    continue
                }
                if (start2 >= str2.length - 1) {
                    rst.append(str1[start1++])
                    continue
                }
                if (suffix[start1] < suffix[str1.length + start2]) {
                    rst.append(str1[start1++])
                } else {
                    rst.append(str2[start2++])
                }
            }
            return rst.toString()
        }
    }
}
