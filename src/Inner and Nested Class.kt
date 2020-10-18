class Outer()
{
     private val name:String?= null
    class Nested
    {
        fun show()
        {
            println("Lijo  ")
        }
    }
}

fun main(args:Array<String>) {
    //var outer=Outer()
    var nested=Outer.Nested()
    nested.show()
}