error id: file://<WORKSPACE>/blockcompanion.scala:[345..345) in Input.VirtualFile("file://<WORKSPACE>/blockcompanion.scala", "case class Transcation(id: String, amount: Double, description: String, totalAmount: Double)

object Transaction{
    def apply(id: String, amount: Double, description: String)(block: Double => Double): Transcation = {
        val processedAmount = block(amount)
        new Transcation(id, amount, description, processedAmount)
    }
}

object ")
file://<WORKSPACE>/file:<WORKSPACE>/blockcompanion.scala
file://<WORKSPACE>/blockcompanion.scala:10: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof