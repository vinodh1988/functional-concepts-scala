object FunctionWithVariableParameters {

    // Function with variable arguments of type Int
    def sum(numbers: Int*): Int = {
        numbers.sum
    }

    // Function with variable arguments of type String
    def concatenate(strings: String*): String = {
        strings.mkString(" ")
    }

    // Function with mixed arguments (fixed and variable)
    def greet(greeting: String, names: String*): String = {
        s"$greeting ${names.mkString(", ")}!"
    }

    // Function with variable arguments and default parameters
    def repeatString(times: Int = 1, strings: String*): Seq[String] = {
        strings.map(str => str * times)
    }

    def main(args: Array[String]): Unit = {
        // Demonstration of sum function
        println(sum(1, 2, 3, 4, 5)) // Output: 15

        // Demonstration of concatenate function
        println(concatenate("Hello", "world", "from", "Scala")) // Output: Hello world from Scala

        // Demonstration of greet function
        println(greet("Hello", "Alice", "Bob", "Charlie")) // Output: Hello Alice, Bob, Charlie!

        // Demonstration of repeatString function
        println(repeatString(3, "Scala", "Rocks")) // Output: List(ScalaScalaScala, RocksRocksRocks)""))
        println(repeatString(strings=Seq("Varargs", "in", "Scala")*) ) // Output: List(Varargs, in, Scala)
        println(repeatString(strings = Seq("Functional", "Programming")*)) // Output: List(Functional, Programming)
    }
}

/* 
  greet("Hi", "Alice", "Bob", "Charlie") ->// greeting = "Hi", names = Seq("Alice", "Bob", "Charlie")
  greet("Alic)
 */