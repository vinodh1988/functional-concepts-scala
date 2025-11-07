object FunctionAsParameterExample {

    // Higher-order function that takes another function as a parameter
    def applyFunctionTwice(f: Int => Int, x: Int): Int = {
        f(f(x))
    }

    def processString(s: String, f: String => String): String = {
        f(s)
    }

    def main(args: Array[String]): Unit = {
        // A simple function to double a number
        val add: (Int,Int)=>Int = (a,b) => a + b // val keyword
        val double: Int => Int = x => x * 2
        def square: Int => Int = x => x * x //df keyword

        val result = applyFunctionTwice(double, 5) // f(f(5)) - 20
        val result2 = applyFunctionTwice( x=> x+100, 500) // f(f(500)) - 700
        println(add(3,4)) // Output: 7
        println(square(6)) // Output: 36
        println(s"Result of applying the function twice: $result") // Output: 20
        println(s"Result of applying the function twice: $result2") // Output: 700

        print(processString("Rohan", str=> s"Hello $str") ) // Output: Hello Rohan

    }
}