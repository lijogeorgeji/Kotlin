fun main()
{
    println("--------Break Statement---------")
for(a in 1..10)
{
    if(a==5)
        break
    println(""+a)
}
    println("--------Continue Statement---------")
    for(a in 10..20)
    {
        if(a==5)
            continue
        println(""+a)
    }


}