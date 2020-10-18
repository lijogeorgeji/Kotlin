fun main()
{
    val message = "Welcome"
    val name = "Lijo"
    val allmessage = message + name
    println(allmessage)
    println(allmessage.toLowerCase())
    println(allmessage.toUpperCase())
    println(message.trim())
    println(message)
    val tokens = name.split("")
    for (token in tokens)
    {
        println("token= $token")
        if (!token.contains("to") && token.contains("is"))
        {
            println("token: $token")
        }

    }
}
