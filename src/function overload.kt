fun add(n1:Int,n2:Int):Int
{
    return n1+n2
}
fun add(n1:Int,n2:Int,n3:Int):Int
{
    return n1+n2+n3
}
fun add(n1:Int,n2:Int,n3:Int,n4:Int):Int
{
    return n1+n2+n3+n4
}

fun main()
{
    println("the number 1")
    println(add(n1 = 12,n2 = 13))
    println("the number 2")
    println(add(n1 = 12,n2 = 14,n3 = 15))
    println("the number 3")
    println(add(n1 = 12,n2 = 13,n3 = 22,n4 = 23))

}