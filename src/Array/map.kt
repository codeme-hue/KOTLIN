package Array

fun main(args: Array<String>){

    //Deklarasi Variable dengan Parameter berupa Key-Value
    val data = mapOf('A' to "Adibil", 'W' to "Wawan", 'F' to "Ferdy", 'R' to "Reyhan")

    //Mencetak semua nilai dari Objek data
    for(getKey in data.keys){
        println(data[getKey])
    }
}