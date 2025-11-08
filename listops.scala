object ListOpsDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(1, 2, 3)
        val list2 = List(4, 5, 6)

        // Concatenation using ':::' operator
        val concatenated = list1 ::: list2
        println(s"Concatenated List (:::): $concatenated")

        // Prepending an element using '::' operator
        val prepended = 0 :: list1
        println(s"Prepended List (::): $prepended")

        // Appending an element using ':+' operator
        val appended = list1 :+ 4
        println(s"Appended List (:+): $appended")

        // Zipping two lists using 'zip' method
        val zipped = list1.zip(list2)
        println(s"Zipped List: $zipped")

        // Mapping over a list using 'map' method
        val mapped = list1.map(_ * 2)
        println(s"Mapped List (each element * 2): $mapped")

        // Filtering a list using 'filter' method
        val filtered = list1.filter(_ % 2 == 0)
        println(s"Filtered List (even numbers): $filtered")

        // Folding a list using 'foldLeft' operator
        val sum = list1.foldLeft(0)(_ + _)
        println(s"Sum of List (foldLeft): $sum")

        // Flattening a list of lists using 'flatten' method
        val listOfLists = List(List(1, 2), List(3, 4))
        val flattened = listOfLists.flatten
        println(s"Flattened List: $flattened")

        // FlatMapping a list using 'flatMap' method
        val flatMapped = list1.flatMap(x => List(x, x * 2))
        println(s"FlatMapped List: $flatMapped")
    }
}