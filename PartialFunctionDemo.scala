def doOnlyIfEven: PartialFunction[Int, String] = {
    case x if x % 2 == 0 => s"$x is even"
}

@main def testPartialFunction(): Unit = {
    println(doOnlyIfEven.isDefinedAt(3)) // Output: false
    println(doOnlyIfEven(30)) // not recommended
    //println(doOnlyIfEven(3))
   // This will throw a MatchError
    val numbers = List(1, 2, 3, 4, 5, 6)
    val evenResults = numbers.collect(doOnlyIfEven) //is defined is called internally
    println(evenResults) // Output: List("2 is even", "4 is even", "6 is even")
    val result = if (doOnlyIfEven.isDefinedAt(3)) doOnlyIfEven(3) else "Not defined"
    println(result) // Output: "4 is even"
}