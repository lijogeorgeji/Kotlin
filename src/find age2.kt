import java.util.*

fun main()
{
    println("enter the year of birth:-- ")
    val a= readLine()!!.toInt()
    val yearInDevice=Calendar.getInstance().get(Calendar.YEAR) /*after val yearindevice is written can also exchange
                                                               with the b,d,e, or any alphabet we want*/
    val b=yearInDevice-a
    println("The age of the person is $b")

}
