import java.util.*

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Enter the Height:")
    var height = input.nextDouble()

    println("Enter the Radius")
    var radius = input.nextDouble()

    var VoC = 3.143 * height * Math.pow(radius,2.0)
    println("The Volume of a Cylinder is $VoC")
}