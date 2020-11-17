fun main() {
    val array = arrayOf("Eggy", "Andika","Wardani")

    for (name in array){
        println(name)
    }

    println('-')

    for (value in 1..20){
        println(value)
    }
    println('-')
    for (value in 100 downTo 0 step 5){
        println(value)
    }

    val arraySize = array.size - 1
    for (i in 0..arraySize){
        println("index $i = ${array.get(i)}")
    }
}