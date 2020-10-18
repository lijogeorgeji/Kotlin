fun main()
{
    println("The Value of A--   ")
    var a= readLine()!!.toInt()
    println("The Value of B--   ")
    var b= readLine()!!.toInt()


    println("------Value Before Swap------")
    println("The Value of A--   "+a)
    println("The Value of B--   "+b)

    a=a+b
    b=a-b
    a=a-b

    println("------Value after Swap------")
    println("The Value of A--   "+a)
    println("The Value of B--   "+b)

}