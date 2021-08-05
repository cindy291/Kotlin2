import java.util.*

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Enter the Principle:")
    var principle = input.nextDouble()

    println("Enter the Rate")
    var rate = input.nextDouble()

    println("Enter the Time(years)")
    var time = input.nextInt()

    var SI = (principle * rate * time)/100
    println("The Simple Interest for $principle is $SI")
}