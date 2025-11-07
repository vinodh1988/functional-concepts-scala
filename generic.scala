object GenericExample {
    // Generic class with type parameter T
    class Box[T](private var value: T) {
        def get: T = value
        def set(newValue: T): Unit = {
            value = newValue
        }
    }

    // Generic method
    def printListElements[A](list: List[A]): Unit = {
        list.foreach(println)
    }

    def main(args: Array[String]): Unit = {
        val intBox: Box[Int] = new Box[Int](10)
        val stringBox: Box[String] = new Box[String]("Scala")

        println(s"Int Box contains: ${intBox.get}")
        println(s"String Box contains: ${stringBox.get}")

        val intList: List[Int] = List(1, 2, 3)
        val stringList: List[String] = List("a", "b", "c")

        println("Int List elements:")
        printListElements(intList)

        println("String List elements:")
        printListElements(stringList)
    }
}