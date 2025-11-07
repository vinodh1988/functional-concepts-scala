### Scala Iterative Statements

In Scala, iterative statements are used to execute a block of code repeatedly based on a condition. Common iterative constructs include:

1. **`for` Loop**: Used for iterating over a range, collection, or generator.
    ```scala
    for (i <- 1 to 5) {
         println(i)
    }
    ```

2. **`while` Loop**: Executes as long as the condition is true.
    ```scala
    var i = 1
    while (i <= 5) {
         println(i)
         i += 1
    }
    ```

3. **`do-while` Loop**: Executes the block at least once before checking the condition.
    ```scala
    var i = 1
    do {
         println(i)
         i += 1
    } while (i <= 5)
    ```

Scala encourages the use of functional constructs like `map`, `filter`, and `foreach` over traditional loops for better readability and immutability.