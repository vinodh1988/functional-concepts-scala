error id: file://<WORKSPACE>/curry.scala:[600..601) in Input.VirtualFile("file://<WORKSPACE>/curry.scala", "case class Person(name: String, age: Int)
case class Thing(name: String, description: String)

def funchain(x:Int)(Y:String):String = {
    s"$x is the number and $Y is the string"
}

def process(processname:String)(iterations:Int):String = {
    for (i <- 1 to iterations) {
        println(s"Processing $processname - iteration $i")
    }
    s"Completed $iterations iterations of $processname"
}
def multilevel(process:String)(location:String)(iterations:Int):Unit={
    for(i <- 1 to iterations) {
        println(s"Processing $process  - iteration $i in the location $location")
    }
}
def 



@main def functionAsReturnValue(): Unit = {
   println(funchain(10)("Hello World"))
   var x=100
   val secondPart=funchain(x)
   println(secondPart("Scala is great"))
   println(secondPart("Scala is too great"))

   val printing=process("printing")
   val coding=process("coding")

   print(printing(10))
   print(coding(5)) // currying
  // multilevel("Designing")("Chennai")(5)
   var design=multilevel("design")
   var designchennai=design("Chennai")
   var designmumbai=design("mumbai")

   design("Bangalore")(5)
   designchennai(5)
   designmumbai(3)
}")
file://<WORKSPACE>/file:<WORKSPACE>/curry.scala
file://<WORKSPACE>/curry.scala:23: error: expected identifier; obtained at
@main def functionAsReturnValue(): Unit = {
^
#### Short summary: 

expected identifier; obtained at