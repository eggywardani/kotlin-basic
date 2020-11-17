fun main() {
//    tailrec fun display(value:Int){
//        println("Recursive $value")
//        if (value > 0){
//            display(value - 1)
//        }
//    }
//display(50000)

    tailrec fun faktorialRecursive(value:Int, total:Int = 1):Int{
        return when(value){
            1->total
            else->faktorialRecursive(value -1, total * value)
        }
    }

    println(faktorialRecursive(5))


}