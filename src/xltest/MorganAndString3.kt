package xltest

import java.util.*

class MorganAndString3 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val input = Scanner(System.`in`)
            val t = input.nextInt()
            for (a0 in 0 until t) {
                val s1 = StringBuilder(input.next())
                s1.append("z") //Menandakan akhir
                val s2 = StringBuilder(input.next())
                s2.append("z") //Menandakan akhir
                val output = StringBuilder("")
                var i = 0
                var j = 0 //Indeks ke setiap string
                while (i < s1.length && j < s2.length) {
                    ////////////Simple cases/////////////
                    if (s1[i] < s2[j]) {
                        output.append(s1[i])
                        i++
                    } else if (s1[i] > s2[j]) {
                        output.append(s2[j])
                        j++
                    } else {
                        if (s1[i] == 'z') {
                            i++
                            j++
                            continue
                        } //End has been reached
                        var startingI = i
                        var startingJ = j

                        //Temukan titik di mana persamaan mereka berbeda
                        while (s1[i] == s2[j]) {
                            i++
                            j++
                            if (i >= s1.length && j >= s2.length) //Mereka adalah string yang sama
                            {
                                i = startingI
                                j = startingJ
                                break
                            } else if (i >= s1.length) //String 1 is shorter than string 2
                            {
                                // Kami menambahkan semua karakter yang berada dalam urutan menurun
                                ////////ex: gdbad akan mengembalikan gdba
                                var prev = s2[startingJ]
                                while (s2[startingJ] <= prev) {
                                    output.append(s2[startingJ])
                                    prev = s2[startingJ]
                                    startingI++
                                }
                                i = startingI
                                j = startingJ
                            } else if (j >= s2.length) //String 2 lebih pendek dari string 1
                            {
                                var prev = s1[startingI]
                                while (s1[startingI] <= prev) {
                                    output.append(s1[startingI])
                                    prev = s1[startingI]
                                    startingI++
                                }
                                i = startingI
                                j = startingJ
                            }
                        }


                        //Mereka adalah string yang berbeda

                        //String 1 secara leksikografis lebih kecil dari String 2
                        if (s1[i] <= s2[j]) {
                            var prev = s1[startingI]
                            while (s1[startingI] <= prev) {
                                output.append(s1[startingI])
                                prev = s1[startingI]
                                startingI++
                            }
                            i = startingI
                            j = startingJ
                        }

                        //String 2 secara leksikografis lebih kecil dari String 1
                        if (s1[i] > s2[j]) {
                            var prev = s2[startingJ]
                            while (s2[startingJ] <= prev) {
                                output.append(s2[startingJ])
                                prev = s2[startingJ]
                                startingJ++
                            }
                            i = startingI
                            j = startingJ
                        }
                    }
                }


                //Kami mencapai akhir 1 string
                //Tambahkan sisa string 1
                while (i < s1.length) {
                    output.append(s1[i])
                    i++
                }

                //Tambahkan sisa string 2
                while (j < s2.length) {
                    output.append(s2[j])
                    j++
                }


                //Print the output
                println(output)
            }
        }
    }
}