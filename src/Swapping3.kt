fun main()
{
    var a=10
    var b=20

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