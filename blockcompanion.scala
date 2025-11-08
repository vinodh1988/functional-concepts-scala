case class Transcation(id: String, amount: Double, description: String, totalAmount: Double)

object Transaction{
    def apply(id: String, amount: Double, description: String)(block: Double => Double): Transcation = {
        val processedAmount = block(amount)
        val totalAmount = amount + processedAmount
        println(s"Processed Amount for Transaction $id: $processedAmount")
        new Transcation(id, amount, description, totalAmount)
    }
}

object TransactionApp {
    def main(args: Array[String]): Unit = {
        val transaction1 = Transaction("TXN1001", 500.0, "Payment Received") { amount =>
            if(amount < 100) 2 else  (amount * 0.02) // Adding 2% processing fee
            
        }

        val transaction2 = Transaction("TXN1002", 1000.0, "Refund Issued") { amount =>
            amount *0.03 // Deducting flat refund fee of $15
        }

        println(s"Transaction ID: ${transaction1.id}, Original Amount: ${transaction1.amount}, Description: ${transaction1.description}, Total Amount after processing: ${transaction1.totalAmount}")
        println(s"Transaction ID: ${transaction2.id}, Original Amount: ${transaction2.amount}, Description: ${transaction2.description}, Total Amount after processing: ${transaction2.totalAmount}")
    }
}