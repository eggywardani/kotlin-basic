fun helloWorld(){
    println("Hello World")
}

fun sayHello(firstName:String,lastName:String,umur:Int = 20){
    println("Hello, nama saya $firstName $lastName dan umur saya $umur")

}

fun main() {
    helloWorld()
    sayHello("Eggy","Andika Wardani",21)
}