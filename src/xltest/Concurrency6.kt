package xltest

import javax.swing.JOptionPane

class Concurrency6 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val num1 = (1..10).shuffled().first() //acak dari element pertama
            val num2 = (1..10).shuffled().last()
            val t1 = calculationThread("Addition")
            t1.getNumber(num1, num2)
            t1.start()
            val t2 = calculationThread("Subtraction")
            t2.getNumber(num1, num2)
            t2.start()
            val t3 = calculationThread("Multiplication")
            t3.getNumber(num1, num2)
            t3.start()
            val t4 = calculationThread("Division")
            t4.getNumber(num1, num2)
            t4.start()
        }
    }

    class calculationThread(private val maths: String) : Thread() {
        private var t: Thread? = null
        private var a = 0
        private var b = 0
        private var resultAddition = 0
        private var resultSubtraction = 0
        private var resultMultiplication = 0
        private var resultDivision = 0
        fun getNumber(num1: Int, num2: Int) {
            a = num1
            b = num2
        }

        override fun start() {
            println("Starting calculation of $maths\n")
            if (t == null) {
                t = Thread(this, maths)
                t!!.start() // tidak null
            }
        }

        override fun run() {
                try {
                    for (x in 0..3) {
                        when (maths) {
                        "Addition" -> {
                            println(
                                """Calculating: $maths of $a + $b = $resultAddition"""
                            )
                            sleep(1000)
                            resultAddition = a + b
                        }
                        "Subtraction" -> {
                            println(
                                """Calculating: $maths of $a - $b = $resultSubtraction"""
                            )
                            sleep(3000)
                            resultSubtraction = a - b
                        }
                        "Multiplication" -> {
                            println(
                                """Calculating: $maths of $a * $b = $resultMultiplication"""
                            )
                            sleep(5000)
                            resultMultiplication = a * b
                        }
                        "Division" -> {
                            println(
                                """Calculating: $maths of $a / $b = $resultDivision"""
                            )
                            sleep(8000)
                            resultDivision = a / b
                        }
                    }
            }
            } catch (e: InterruptedException) {
                println("Math function failed")
            } finally {
                when (maths) {
                    "Addition" -> {
                        println("Addition completed.")
                    }
                    "Subtraction" -> {
                        println("Subtraction completed.")
                    }
                    "Multiplication" -> {
                        println("Multiplication completed.")
                    }
                    "Division" -> {
                        println("Division completed.")
                    }
                }
            }
        }
    }
}
