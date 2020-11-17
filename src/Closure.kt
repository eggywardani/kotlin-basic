fun main() {
    var counter = 0
    val lambdaIncrement:()->Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymIncrement =fun(){
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymIncrement()
    functionIncrement()
    println(counter)
}