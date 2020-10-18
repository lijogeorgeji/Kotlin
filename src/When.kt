fun main()
{
    println("Enter number between 1 to 2 for food  and  3 to 4 for juice")
    var Food= readLine()!!.toInt()
    var Juice= readLine()!!.toInt()

    when(Food)
    {
        1-> {
            println("Cotton candy")
            println("Burger")
            println("Sandwhich")
        }

        2-> {
            println("parotha")
            println("Beef")
            println("Chicken")
        }
    }

    when(Juice)
    {
        3-> {
            println("virgin mojito")
            println("cocktail")
            println("Wine soda")
        }

        4-> {
            println("Mango juice")
            println("Banana Shake")
            println("Grape juice")
        }
    }


}