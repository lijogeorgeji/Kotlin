/*AND Gate
t&&t=t
t&&f=f
f&&t=f
F&&f=f
 */


/*OR Gate
t&&t=t
t&&f=t
f&&t=t
F&&f=f
 */

/*NOT Gate
t=f
f=t
 */


fun main(){
    println("Enter the value of A")
    var a= readLine()!!.toInt()
    println("Enter the value of B")
    var b= readLine()!!.toInt()
    println("the given values are $a $b")
    var c=(a<b)
    println("The given condition is "+c)
}