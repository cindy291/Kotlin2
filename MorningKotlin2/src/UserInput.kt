import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    //for input we need a scanner
    var chukua = Scanner(System.`in`)

    println("Enter Your Name:")
    var name = chukua.next()

    println("Enter Your Weight:")
    var weight = chukua.nextDouble()

    println("Enter Your Height:")
    var height = chukua.nextDouble()

    var BMI = weight/Math.pow(height,2.0)
    println("Hello $name your BMI is $BMI")
}