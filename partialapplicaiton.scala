object PartialApplied {
    // A simple function that takes three Ints and returns their sum
    def add(a: Int, b: Int, c: Int): Int = a + b + c

    def main(args: Array[String]): Unit = {
        // Partially applied function: fixing the first argument
        val add5 = add(5, _: Int, _: Int)
        println(add5(10, 15)) // Output: 30

        // Another example: fixing the first two arguments
        val add7and8 = add(7, 8, _: Int)
        println(add7and8(20)) // Output: 35

        // Using partial application with higher-order functions
        val nums = List(1, 2, 3)
        val add10 = add(10, _: Int, _: Int)
        val results = nums.map(n => add10(n, n))
        println(results) // Output: List(12, 14, 16)
    }
}