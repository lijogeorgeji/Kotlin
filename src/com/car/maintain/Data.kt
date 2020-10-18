package com.car.maintain

data class Person(val name:String,val age:Int,val gender:String)
fun main()
{
    val person=Person(name = "Lijo George", age = 23,gender = "Male")
    println("Person name ${person.name}")
    println("Person age ${person.age}")
    println("Person Gender ${person.gender}")

}