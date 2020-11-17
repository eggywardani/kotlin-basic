fun main() {
    fun hello(name:String,transformer:(String)->String):String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value:String->value.toUpperCase()}
    println(hello("Fathinnuha",lambdaUpper))
    println(hello("Fathinnuha",{value:String->value.toLowerCase() }))

    val result = hello("Amalia"){value:String->
        value.toLowerCase()
    }
    println(result)
}