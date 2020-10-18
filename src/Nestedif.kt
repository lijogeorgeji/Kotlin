fun main()
{
    println("Enter your grade")
    var grade= readLine()!!.toInt()
    if(grade>=90)
    {
        if(grade>93) {
            println("A+")
        }
        else
        {
            println("A")
        }
    }
    else if(grade in 80..89) {
        if (grade > 85) {
            println("B+")
        } else {
            println("B")
        }
    }
    println("end of the programme")
}