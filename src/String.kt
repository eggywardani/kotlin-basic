fun main() {
    var firstName:String = "Eggy Andika"
    var lastName:String = "Wardani"
    var fullName:String = "$firstName $lastName"
    var desc:String = "Total $fullName char = ${fullName.length}"

    var address:String = """
        jalan pemuda, Mijen
        Kaliwungu Kudus
        Jawa Tengah
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(fullName)
    println(desc)
    println(address)
}