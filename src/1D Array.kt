fun main()
{
    println("Pets Application")
    println("How many pets you have---")
    val maxsize= readLine()!!.toInt()
    var listofpets:Array<String> = Array(maxsize){""}
    for (i in 0 until maxsize)
    {
        print("Enter pet name $i:-    ")
        listofpets[i]= readLine()!!.toString()
    }
    println("The Pets are:-")
    for (i in 0 until maxsize)
    {
        println("pet $i:  ${listofpets[i]}")
    }
}