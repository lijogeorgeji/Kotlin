import java.util.*
import kotlin.collections.ArrayList

fun main(args:Array<String>)
{
    var listofname= ArrayList<String>()
    listofname.add("Lijo")
    listofname.add("Lily")
    listofname.add("Liviya")
    println("Before sort")
    for(name in listofname)
    {
        println(name)
    }
    println("After Sort")
    Collections.sort(listofname)
    for (name in listofname)
    {
        println(name)
    }
}

