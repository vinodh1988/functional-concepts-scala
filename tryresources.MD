# Try-With-Resources in Scala

In Scala, there is no direct equivalent to Java's `try-with-resources` construct. However, you can achieve similar functionality using the `Loan Pattern` or `Using` construct. This ensures that resources are properly closed after use.

## Example: Using `Using` from Scala Standard Library

Scala 2.13+ provides the `Using` utility in the `scala.util` package:

```scala
import scala.util.Using
import java.io._

val filePath = "example.txt"

Using(eader =>
    println(reader.readLine())
} // The resource is automatically closed here
```

## Example: Custom Loan Pattern

For earlier versions of Scala, you can define your own utility:

```scala
def using[A <: AutoCloseable, B](resource: A)(block: A => B): B = {
    try {
        block(resource)
    } finally {
        if (resource != null) resource.close()
    }
}

val filePath = "example.txt"

using(new BufferedReader(new FileReader(filePath))) { reader =>
    println(reader.readLine())
}
```
new BufferedReader(new FileReader(filePath))) { r
Both approaches ensure that the resource is closed after the block is executed, even in case of exceptions.
