object LoopsWithoutBreak {
    def main(args: Array[String]): Unit = {
        val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        // Using takeWhile
        println("Using takeWhile:")
        numbers.takeWhile(_ < 6).foreach(println)

        // Using for loop without continue
        println("\nUsing for loop:")
        for (num <- numbers) {
            if (num >= 6) {
                // Skip the rest of the loop for numbers >= 6
            } else {
                println(num)
            }
        }

        // Using ternary-like expression with if-else
        println("\nUsing ternary-like expression:")
        numbers.foreach(num => println(if (num < 6) num else "Skipped"))
    }
}