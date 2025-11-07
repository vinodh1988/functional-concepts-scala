
def funchain(x:Int)(Y:String):String = {
    s"$x is the number and $Y is the string"
}

def process(processname:String)(iterations:Int):String = {
    for (i <- 1 to iterations) {
        println(s"Processing $processname - iteration $i")
    }
    s"Completed $iterations iterations of $processname"
}

@main def functionAsReturnValue(): Unit = {
   println(funchain(10)("Hello World"))
   val secondPart=funchain(100)
   println(secondPart("Scala is great"))

   val printing=process("printing")
   val coding=process("coding")

   print(printing(10))
   print(coding(5)) // currying
}