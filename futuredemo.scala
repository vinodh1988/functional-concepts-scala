import scala.util.{Success,Failure}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

def provideMeData():Future[String] = {
println("Starting to provide data...")
Future {
    Thread.sleep(3000)
    "Data from Future object" 
}

}

@main def futureDemo(): Unit = {
    val futureData=provideMeData() // function calll
    futureData.onComplete {
        case Success(value) => println(s"Received value: $value")
        case Failure(exception) => println(s"Failed with exception: $exception")
    }
    println("Doing other work while waiting for the future to complete...")
    Thread.sleep(5000) // Keep the main thread alive to see the future result
}