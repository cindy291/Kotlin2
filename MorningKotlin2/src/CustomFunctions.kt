import java.util.*

fun motto(){
    println("Hello, this is our motto")
}
//Average method
fun avg(x:Int, y:Double, z:Float){
    var average = (x + y + z)/3.0
    println("Your answer is $average")
}

//SI method
fun SI(p:Double, r:Double, t:Double){
    var simple_interest = (p * r * t)/100.0
    if (simple_interest <= 10000){
        println("Take the loan. Your simple interest will be $simple_interest")
    }else{
        println("Please consider other options this loan is too expensive")
    }
}

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    motto()
    avg(455, 505.5, 630.567f)

    println("Enter Principle")
    var principle = scanner.nextDouble()
    println("Enter Rate")
    var rate = scanner.nextDouble()
    println("Enter Time")
    var time = scanner.nextDouble()
    //Calling the SI function
    SI(principle,rate,time)
}

