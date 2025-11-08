def myfilter(list:List[Int], predicate:Int=>Boolean):List[Int]={ 
    if(list.isEmpty) None
    for (elem <- list if predicate(elem)) yield elem
}

@main def testMyFilter(): Unit = {
println(myfilter(List(1,2,3,4,5,6), x=> x%2==0)) // List(2,4,6)
println(myfilter(List(1,2,3,4,5,6), _%2!=0)) // List(1,3,5)
}