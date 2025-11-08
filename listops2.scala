object ListOpsDemo extends App {
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)

    // :: (Cons) - Adds an element to the beginning of the list
    val consList = 0 :: list1
    println(s":: operator: $consList")

    // ::: (List concatenation)
    val concatenatedList = list1 ::: list2
    println(s"::: operator: $concatenatedList")

    // ++ (List concatenation)
    val concatenatedList2 = list1 ++ list2
    println(s"++ operator: $concatenatedList2")

    // +: (Prepends an element)
    val prependedList = 0 +: list1
    println(s"+: operator: $prependedList")

    // :+ (Appends an element)
    val appendedList = list1 :+ 4
    println(s":+ operator: $appendedList")

    // zip (Combines two lists into pairs)
    val zippedList = list1.zip(list2)
    println(s"zip operator: $zippedList")

    // ::: (Flattening nested lists)
    val nestedList = List(List(1, 2), List(3, 4))
    val flattenedList = nestedList.flatten
    println(s"flatten operator: $flattenedList")

    // map (Applies a function to each element)
    val mappedList = list1.map(_ * 2)
    println(s"map operator: $mappedList")

    // filter (Filters elements based on a predicate)
    val filteredList = list1.filter(_ % 2 == 0)
    println(s"filter operator: $filteredList")

    // foldLeft (Aggregates values from left to right)
    val sum = list1.foldLeft(0)(_ + _)
    println(s"foldLeft operator: $sum")

    // foldRight (Aggregates values from right to left)
    val product = list1.foldRight(1)(_ * _)
    println(s"foldRight operator: $product")
}