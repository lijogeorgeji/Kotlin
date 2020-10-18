package com.car.maintain

interface CreditCard{
    val CardNumber:String               //Interface is used here
    fun score(age:Int)
}

class MasterCard(override val CardNumber: String) :CreditCard {

    override fun score(age: Int) {
       if (age>50)
       {
           println("Negative")
       }
        else
       {
           println("Positive")
       }
    }
}


class VisaCard(override val CardNumber: String) :CreditCard {

    override fun score(age: Int) {
        if (age>60)
        {
            println("Negative")
        }
        else
        {
            println("Positive")
        }
    }
}

class Paypal(client:CreditCard): CreditCard by client
{
   fun print(){
       println(this.CardNumber)
   }                 //Delegation is used here
}

fun main()
{
    val visa=VisaCard("3411144286")
    visa.score(60)
    val paypal1=Paypal(visa)
    println("the number is ${paypal1.CardNumber}")
    paypal1.print()

    val master=MasterCard("34111465")
    visa.score(100)

    val paypal2=Paypal(master)
    println("the number is ${paypal2.CardNumber}")
    paypal2.print()
}
