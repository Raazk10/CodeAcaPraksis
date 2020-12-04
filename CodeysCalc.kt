
class Calculator(private val name:String) {

    init {
        println("$name's Calculator")
    }
    val add = {a:Int,b:Int -> a+b}
    val subtract = {a:Int,b:Int -> a - b}
    val multiplication = {a:Int,b:Int -> a * b}
    val divide = {a:Int,b:Int -> if (b==0) "Error! Dividing by zero is not allowed"
    else a / b
    }
    fun power(a: Int,b:Int): Int {
        var result = 1
        for (i in 1..b) {
            result *= a

        }
        return result
    }
}
fun main() {
    val calc = Calculator("Raj")
    println(calc.add(10,5))
    println( calc.subtract(10,5))
    println(calc.multiplication(10,5))
    println(calc.divide(10,2))
    println( calc.power(3,2))



    /*fun add(a: Int, b: Int): Int {
        return a + b
         }*/
    /*fun subtract(a: Int, b: Int): Int {
        return a - b
         }
    fun multiplication(a: Int, b: Int): Int {
        return a * b

    }

    fun divide(a: Int, b: Int): Any {
        return if (b == 0) {
            "Error! Dividing by zero is not allowed"
        } else {
            a / b

        }
    }
*/
   }