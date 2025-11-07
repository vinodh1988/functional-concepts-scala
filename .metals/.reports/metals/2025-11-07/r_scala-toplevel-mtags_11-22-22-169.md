error id: file://<WORKSPACE>/functionAsParameter.scala:[205..208) in Input.VirtualFile("file://<WORKSPACE>/functionAsParameter.scala", "object FunctionAsParameterExample {

    // Higher-order function that takes another function as a parameter
    def applyFunctionTwice(f: Int => Int, x: Int): Int = {
        f(f(x))
    }

    def 

    def main(args: Array[String]): Unit = {
        // A simple function to double a number
        val double: Int => Int = x => x * 2

        val result = applyFunctionTwice(double, 5)
        println(s"Result of applying the function twice: $result") // Output: 20
    }
}")
file://<WORKSPACE>/file:<WORKSPACE>/functionAsParameter.scala
file://<WORKSPACE>/functionAsParameter.scala:10: error: expected identifier; obtained def
    def main(args: Array[String]): Unit = {
    ^
#### Short summary: 

expected identifier; obtained def