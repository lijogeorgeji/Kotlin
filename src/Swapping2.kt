fun main()
{
    println("Write the value for a:-")
    var a= readLine()
    println("Write the value for b:-")
    var b=readLine()


    println("----The value before swap-------")
    println("The Value of a:--- "+a)
    println("The Value of b:--- "+b)
    val c=a
    a=b
    b=c
    println("----The value after swap-------")
    println("The Value of a:--- "+a)
    println("The Value of b:--- "+b)


}