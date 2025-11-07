error id: file://<WORKSPACE>/curry.scala:[311..312) in Input.VirtualFile("file://<WORKSPACE>/curry.scala", "
def funchain(x:Int)(Y:String):String = {
    s"$x is the number and $Y is the string"
}

def process(processname:String)(iterations:Int):String = {
    for (i <- 1 to iterations) {
        println(s"Processing $processname - iteration $i")
    }
    s"Completed $iterations iterations of $processname"
}
def 

@main def functionAsReturnValue(): Unit = {
   println(funchain(10)("Hello World"))
   val secondPart=funchain(100)
   println(secondPart("Scala is great"))

   val printing=process("printing")
   val coding=process("coding")

   print(printing(10))
   print(coding(5)) // currying
}")
file://<WORKSPACE>/file:<WORKSPACE>/curry.scala
file://<WORKSPACE>/curry.scala:14: error: expected identifier; obtained at
@main def functionAsReturnValue(): Unit = {
^
#### Short summary: 

expected identifier; obtained at