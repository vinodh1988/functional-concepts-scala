object ExceptionHandlingDemo {
    def main(args: Array[String]): Unit = {
        try {
            // Example of code that may throw exceptions
            val numbers = Array(1, 2, 3)
            println(numbers(5)) // This will throw an ArrayIndexOutOfBoundsException
            val result = 10 / 0 // This will throw an ArithmeticException
        } catch {
            case e: ArithmeticException =>
                println(s"ArithmeticException caught: ${e.getMessage}")
            case e: ArrayIndexOutOfBoundsException =>
                println(s"ArrayIndexOutOfBoundsException caught: ${e.getMessage}")
            case e: Exception =>
                println(s"General exception caught: ${e.getMessage}")
        } finally {
            println("Finally block executed.")
        }
    }
}