fun toUpper(value:String):String = value.toUpperCase()

fun main() {
    val contohLambda:(String, String)->String ={firstName:String, lastName:String->
        val result = "$firstName $lastName"
        result
    }

    val sayHello:(String)->String = {
        "Hello $it"
    }

    println(sayHello("Fanna"))
    println(contohLambda("Eggy Andika","Wardani"))
    val toUppercase:(String)->String = ::toUpper
    println(toUppercase("Fanna Vero"))
}