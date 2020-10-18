fun main()
{
    println("Enter the value for a:- ")
    var a= readLine()!!.toInt()
    println("Enter the value for b:- ")
    var b= readLine()!!.toInt()


    val sum=a+b
    val mul=a*b
    val sub=a-b
    val divide=a/b
    val moduls= a%b

    println("The Sum------   "+sum)
    println("The Multiply----"+mul)
    println("The Subtract:---"+sub)
    println("The Divide:---  "+divide)
    println("The Modulus:--- "+moduls)
}