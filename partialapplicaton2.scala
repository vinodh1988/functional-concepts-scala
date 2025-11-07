object PartialAppliedCollections {
    // A function that takes two Ints and returns their sum
    def add(x: Int, y: Int): Int = x + y

    // Partially applied function: fix x = 10
    val add10: Int => Int = add(10, _)

    // Using partial application with map
    val numbers = List(1, 2, 3, 4, 5)
    val added10 = numbers.map(add10) // List(11, 12, 13, 14, 15)

    // Another example: filtering strings by length
    def longerThan(n: Int, s: String): Boolean = s.length > n
    val longerThan3: String => Boolean = longerThan(3, _)
    val words = List("Scala", "is", "fun", "powerful")
    val longWords = words.filter(longerThan3) // List("Scala", "powerful")

    // Print results
    def main(args: Array[String]): Unit = {
        println(added10)
        println(longWords)
    }
}