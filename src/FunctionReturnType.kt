fun sum(a:Int,b:Int):Int{
    val jumlah = a+b
    return jumlah
}

fun bagi(a:Int,b:Int):Int{
    if (b == 0){
        return 0
    }else{
        val hasilBagi = a/b

        return hasilBagi
    }

}
fun main() {
    println(sum(10,1000))

    val hasil = sum(2000,2340)
    println(hasil)

    println(bagi(10,2))
    println(bagi(10,0))


}