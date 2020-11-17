fun String.hello():String = "Hello $this"

fun main() {
    val name = "Eggy"
    println(name.hello())
}