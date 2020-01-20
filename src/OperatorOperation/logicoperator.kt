package OperatorOperation

fun main() {
    /**
     * Logika operator
     * AND OR dan NOT
     * && || dan !
     * || itu bernilai salah jika keduanya bernilai salah, jika tidak maka iya bernilai benar
     * && itu terjadi benar apabila kedua kondisi itu bernilai benar
     * ! itu adalah kebalikan dari hasil kondisi
     **/

    var nomorPertama = 2
    var nomorKedua = 3
    var nomorKetiga = 4

    //kondisi && dimana dalam kedua statementnya bernila benar
    if ((nomorPertama < nomorKedua) && (nomorKedua > nomorPertama)) {
               //bernilai benar             //bernilai benar
        print("kondisi bernilai benar")

    } else {
        print("kondisi bernilai salah")
    }


    //kondisi || dimana dalam kedua statementnya bernila salah
    if ((nomorPertama > nomorKedua) && (nomorKedua < nomorPertama)) {
        //bernilai salah             //bernilai salah
        print("kondisi bernilai benar")

    } else {
        print("kondisi bernilai salah")
    }

    //kondisi ! dimana apabila kita menaruh simbol tersebut maka nilai dari statement tersebut terbalik
    if ((nomorKetiga > nomorKedua) && !(nomorKedua > nomorPertama)) {
        //bernilai benar             //awalnya bernilai benar
                                     //namun setelah di taruh simbol ini(!) maka nilainya berbanding terbalik
        print("kondisi bernilai benar")

    } else {
        print("kondisi bernilai salah")
    }



}
