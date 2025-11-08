def assemble(parts:List[String]):String = {
    for (part <- parts)
        println(s"Assembling part: $part")
    "Finished Machine"
}

def paintMachine(machine:String):Unit = {
    println(s"Painting $machine with preferred color")
}

@main def composeFunctions(): Unit = {
    val parts = List("Engine", "Wheels", "Chassis")
    val process=assemble.andThen(paintMachine)
    process(parts) //composition of functions
}