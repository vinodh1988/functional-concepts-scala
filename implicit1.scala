object ImplicitConversionsDemo extends App {
    // Example 1: Implicit conversion from Int to String
    implicit def intToString(x: Int): String = x.toString
    // This implicit conversion allows automatic conversion from Int to String

    val str: String = 42 // intToString is invoked implicitly
    println(s"Implicit Int to String: $str")

    // Example 2: Implicit class to add new methods
    implicit class RichInt(val x: Int) extends AnyVal {
        def squared: Int = x * x
    } // Extending functionality of Existing Type (Int)

    val number: Int = 5
    println(s"$number squared: ${number.squared}")
    println(s"5 squared: ${5.squared}")

    // Example 3: Implicit conversion for custom types
    case class Celsius(degrees: Double)
    case class Fahrenheit(degrees: Double)

    implicit def fahrenheitToCelsius(f: Fahrenheit): Celsius =
        Celsius((f.degrees - 32) * 5.0 / 9.0)

    def printCelsius(c: Celsius): Unit =
        println(s"${c.degrees}°C")

    val tempF = Fahrenheit(98.6) // Fahrenheit object
    printCelsius(tempF) // Implicit conversion from Fahrenheit to Celsius

    // Example 4: Implicit parameter
    def greet(name: String)(implicit greeting: String): Unit =
        println(s"$greeting, $name!")

    implicit val defaultGreeting: String = "Hello"
    greet("Scala") // Uses implicit greeting
}