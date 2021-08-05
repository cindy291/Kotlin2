/*Create a method that ensures the user has enter the following email:emobilis@gmail.com and password:emobilis123
there after proceed to calculate the BMI of the user to indicate:
under-weight
normal weight
over-weight
obese
n/b all input id from the user*/
import java.util.*

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Enter your email")
    var email = input.next()

    println("Enter your password")
    var pass = input.next()

    validate(email,pass)
}

fun validate(email:String, pass:String) {
    var input = Scanner(System.`in`)

    if (email == "emobilis@gmail.com" && pass == "emobilis123"){
        println("Enter Weight")
        var weight = input.nextDouble()

        println("Enter Height")
        var height = input.nextDouble()

        var BMI = weight/Math.pow(height,2.0)
        if(BMI<10.5){
            println("You are Under-weight")
        }else if (BMI<20.5){
            println("You are Normal-weight")
        }else if (BMI<30.5){
            println("You are Over-weight")
        }else{
            println("You are Obese")
        }
    }else{
        println("Sorry wrong credentials")
    }
}