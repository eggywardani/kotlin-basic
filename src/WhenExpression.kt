fun main() {
    val finalExam = 'A'

    when(finalExam){
//        'A'-> println("Wow Amazing")
//        'B'-> println("Good")
//        'C'-> println("Not Bad")
//        'D'-> println("Bad")
//        'E'-> println("Try Again")
//        else-> println("ups.....")
        'A','B','C'-> println("Lulus")
        else-> println("Tidak Lulus")
    }

    val nilai = "D"
    val nilaiLulus:Array<String> = arrayOf("A","B","C")

    when(nilai){
        in nilaiLulus-> println("Lulus")
        !in nilaiLulus-> println("Tidak Lulus")
    }

    val name="Eggy"
    when(name){
        is String-> println("String")
        !is String-> println("Not String")
    }



}