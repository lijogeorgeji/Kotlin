fun main() {
    for (userID in 1..2) {
        println("$userID Enter your name:  ")
        val name = readLine()!!.toString()
        println("Where you live")
        val liveplace = readLine()!!.toString()
        var petName: String? = ""
        for (petID in 1..3) {
            print("Enter pet $petID:-  ")
            petName = petName + readLine()!!.toString() + ","
        }


        println("----User Information-------")
        println("name: $name")
        println("liveplace: $liveplace")
        println("petName: $petName")

        if (petName!!.contains("cat")) {
            println("we love your cat")
        }
    }
}