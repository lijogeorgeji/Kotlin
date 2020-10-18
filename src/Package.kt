import com.car.maintain.Car

fun main()
{
    val car1= Car(type = "bmw",model = 555, price = 5555555, Ownername = "lijo george", mile = 10000.0)
    car1.type="lijo"
    println(car1.type )
    println(car1.model)
    println(car1.Ownername)
    println(car1.getCarprice())
    println()
    println()
    val car2= Car(type = "hyundai",model = 10, price = 1000000, Ownername = "lijo george", mile = 15000.0)
    println(car2.type )
    println(car2.price)
    println(car2.Ownername)
    println(car1.getCarprice())
}