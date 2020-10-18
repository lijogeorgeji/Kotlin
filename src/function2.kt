
fun addNumbers (x:Double=0.0,y:Double=0.0):Double
{
    val temp=x+y
    return temp
}

fun displayinfo(vararg names:String){
    for (name in names)
    {
        println(name)
    }

}
fun main()
{
    var returnAdd =addNumbers(x = 3.0,y = 4.0)
    println("returnadd:$returnAdd")
    returnAdd =addNumbers(x = 30.0,y = 4.0)
    println("returnadd:$returnAdd")
    returnAdd =addNumbers(x = 10.0)
    println("returnadd:$returnAdd")

    displayinfo(names = *arrayOf("lijo","akshat","jerry","girish"))
}