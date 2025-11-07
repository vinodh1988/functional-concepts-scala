object HigherOrderFunctions {

   def performOperation(x: Int, y: Int, operation: (Int, Int) => Int): Int = {
       print("Operation preprocessing...\n")
       val result:Int =operation(x, y)
       println("Operation postprocessing...\n")
       result
   }

   def main(args: Array[String]): Unit = {
      print(performOperation(15,25,(a,b)=> (a*2)+(b*2)))
      def multiply: (Int,Int)=>Int = (a,b) => a * b
      def subtract: (Int,Int)=>Int = (a,b) => a - b
      def add: (Int,Int)=>Int = (a,b) => a + b
      def divide: (Int,Int)=>Int = (a,b) => a / b
      print(performOperation(100,20,divide))
      print(performOperation(50,30,subtract))
      print(performOperation(40,60,add))
      print(performOperation(6,7,multiply ))
   }

}