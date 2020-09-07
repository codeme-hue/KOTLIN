package array

fun main(args: Array<String>){

    //Deklarasi Variable dengan Parameter berupa Key-Value
    val data = HashMap<Int, String>()

    //Manambahkan key dan value kedalam objek data
    data[77] = "KARDI HAEKAL"
    data[95] = "AKBAR CAHYA"
    data[8] = "Kotlin Programming"

    //Mencetak semua nilai dari Objek data
    for(getKey in data.keys){
        println(data[getKey])
    }
}