import java.lang.Exception

fun main(args:Array<String>){
    try {
        print("Enter n2")
        var n2:Int= readLine()!!.toInt()
        var Div=100/n2
        println("Div: $Div")
    }catch (ex:Exception)
    {
        println(ex.message)
    }
    println("App Is done")
}