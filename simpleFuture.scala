import scala.concurrent.{Future, ExecutionContext}
import scala.concurrent.ExecutionContext.Implicits.global

object SimpleFutureExample {
    def simpleFutureFunction(): Future[String] = {
        Future {
            // Simulate some computation or I/O
            Thread.sleep(1000)
            "Hello from the Future!"
        }
    }

    def main(args: Array[String]): Unit = {
        val futureResult = simpleFutureFunction()
        futureResult.foreach(result => println(result))
        // Keep the application alive to see the result
        Thread.sleep(2000)
    }
}