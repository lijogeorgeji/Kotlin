val sum={number1:Int,number2:Int ->
    number1+number2
}

fun main() {
    val addnum = sum(3, 4)
    println("addnum $addnum")
    println("List of numbers")
    val listofnumbers = listOf(10, 20, 15, 22, 34, 80)

    listofnumbers.forEach{
        number ->
        println(number)
    }

}