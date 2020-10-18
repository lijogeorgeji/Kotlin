import java.util.*

fun main()
{
    println("Pets Application")

    var listofpets=LinkedList<String>()
    do {
        println("Enter pet name or exit to quit:-  ")
        val petname= readLine()!!.toString()
        if (petname!="quit") {
            listofpets.add(petname)
        }

    }while (petname!="quit")

    println("your pets are using index")
    for (i in 0 until listofpets.size)
    {
        println("pet $i: $listofpets")
    }
    println("your pets using object")
    for (pet in listofpets)
    {
        println("pet: $pet")
    }

    if (listofpets.contains("cat"))
    {
        println("you haveing cat")
        println("i am coming home")
    }

}