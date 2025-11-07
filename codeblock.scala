object CodeBlockExample {
    def main(args: Array[String]): Unit = {
        // A code block in Scala is a set of expressions enclosed in curly braces {}
        lazy val result = {
            print("Evaluating code block...\n")
            10 + 20 // The value of the block is the value of the last expression
        }
        println("Before making use of result")
        println(s"Result of code block: $result")
       
    }
}