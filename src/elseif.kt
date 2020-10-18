fun main()
{
    println("Enter your Age")
    var age= readLine()!!.toInt()
    if(age<=60)
    {
        println("you cannot vote")
    }
    else if(age>=60)

    {
        println("you can vote")
    }
    println("end of the programme")
}