import scala.util.control.Breaks._

object BreakAndContinueExample {
    def main(args: Array[String]): Unit = {
        println("Break example:")
        breakable {
            for (i <- 1 to 10) {
                if (i == 5) break // Exits the loop when i == 5
                println(s"i = $i")
            }
        }

        println("\nContinue example:")
        for (i <- 1 to 10) {
            breakable {
                if (i % 2 == 0) break // Skips the even numbers
                println(s"i = $i")
            }
        }
    }
}