fun main(){
    println("---Break----")
    loop@for(a in 1..10)
    {
        println("a: $a")
      for (b in 1..7){
            println("I am Lijo HahAHAha: $b")
            if (b==6){
break@loop
            }
        }
    }
}