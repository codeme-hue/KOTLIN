package random.lambda

/**
 * random.lambda()
 * jika ingin di panggil maka harus ada tanda ini ()
 * */

fun main() {

    var lambdaku = {print("Hello world")}
    lambdaku()

    var testLambda = {laptop: Int, hp: Int -> (laptop*hp)}
    var hasil = testLambda(20000, 30000)
    print(hasil)

}