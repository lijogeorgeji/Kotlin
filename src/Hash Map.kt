fun main()
{
    var listofuser= hashMapOf<Int,String>()
    listofuser[123]="A"
    listofuser[231]="B"
    listofuser[778]="C"
    for (key in listofuser.keys)
        println("$key: ${listofuser[key]}")
}