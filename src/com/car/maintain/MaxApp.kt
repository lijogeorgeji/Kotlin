package com.car.maintain
fun ArrayList<Int>.FindMax(): Int {
    var MaxNumber=0
    for (item in this){
        if (item>MaxNumber)
        {
            MaxNumber=item
        }
    }
    return MaxNumber
}

fun main()
{
    val listofelements=ArrayList<Int>()
    listofelements.add(12)
    listofelements.add(14)
    listofelements.add(16)
    listofelements.add(18)
for(item in listofelements){
    println(item)
}
    println( "Max: ${listofelements.FindMax()}")
}