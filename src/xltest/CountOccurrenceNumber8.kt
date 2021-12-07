package xltest

class CountOccurrenceNumber8 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //Initialize random.array
            val arr = intArrayOf(4,6,3,5,4,6,7,8,3,4,6,7,5,4,6,4,4,5,6)
            //Array fr will store frequencies of element
            val fr = IntArray(arr.size)
            val visited = -1
            for (i in arr.indices) {
                var count = 1
                for (j in i + 1 until arr.size) {
                    if (arr[i] == arr[j]) {
                        count++
                        //To avoid counting same element again
                        fr[j] = visited
                    }
                }
                if (fr[i] != visited) fr[i] = count
            }

            //Displays the frequency of each element present in random.array
            println(" number --> total")
            for (i in fr.indices) {
                if (fr[i] != visited) println("    " + arr[i] + " --> " + fr[i])
            }
        }
    }
}