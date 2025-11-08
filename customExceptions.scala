// Define a custom exception in Scala with overridden methods
class CustomException(message: String, val errorCode: Int) extends Exception(message) {
    override def toString: String = s"CustomException(errorCode=$errorCode, message=$message)"
    override def getMessage: String = s"Error $errorCode: $message"
}

// Example usage
object CustomExceptionExample {
    def main(args: Array[String]): Unit = {
        try {
            throw new CustomException("This is a custom exception", 404)
        } catch {
            case e: CustomException => println(s"Caught a custom exception: ${e.toString}")
            case e: Exception => println(s"Caught a general exception: ${e.getMessage}")
        }
    }
}