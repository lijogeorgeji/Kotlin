import java.io.FileWriter

fun main(args:Array<String>)
{
    println("erite")
    var str:String= readLine().toString()
    WritetoFile(str)

}
fun WritetoFile(str:String)
{
    try {
        var fo=FileWriter("test.txt",true)
        fo.write(str+"\n")
        fo.close()
    }catch (ex:Exception)
    {
        println(ex.message)
    }
}