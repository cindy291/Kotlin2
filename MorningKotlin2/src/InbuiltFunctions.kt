fun main(args: Array<String>) {
    var number: Double
    number = 10.0
    //The Math function
    println(Math.pow(number, 2.0))
    println(5 / 2.0)

    var x: String
    var y: String

    var a:Double
    var b:Double

    var p: Int
    var q: Int

    x = "50"
    y = "100"
    //output will be a concatenated string of the value of x and y
    println(x + y)

    a = x.toDouble()
    b = y.toDouble()
    //converting the strings to doubles to give a math result of a + b
    println(a + b)

    p = x.toInt()
    q = y.toInt()
    //converting the strings to integers to give a math result of p + q
    println(p + q)
}