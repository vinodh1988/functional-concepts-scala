### Scala Iterative Statements

### Partial Functions in Scala

Partial functions in Scala are functions that are defined only for a subset of their input domain. They are particularly useful when you want to handle specific cases of input while ignoring others. A partial function is represented by the `PartialFunction` trait.

#### Defining a Partial Function
A partial function can be defined using the `case` keyword:
```scala
val partial: PartialFunction[Int, String] = {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
}
```

#### Checking if a Partial Function is Defined
You can use the `isDefinedAt` method to check if the partial function is defined for a specific input:
```scala
println(partial.isDefinedAt(1)) // true
println(partial.isDefinedAt(4)) // false
```

#### Applying a Partial Function
When applying a partial function, ensure that it is defined for the input to avoid runtime errors:
```scala
if (partial.isDefinedAt(2)) {
    println(partial(2)) // "Two"
}
```

#### Benefits of Partial Functions
1. **Selective Input Handling**: Allows you to focus on specific cases without handling all possible inputs.
2. **Improved Readability**: The `case` syntax makes the intent clear and concise.
3. **Composability**: Partial functions can be combined using `orElse` to handle a broader range of inputs:
     ```scala
     val additional: PartialFunction[Int, String] = {
         case 4 => "Four"
     }
     val combined = partial.orElse(additional)
     println(combined(4)) // "Four"
     ```

Partial functions are a powerful feature in Scala, enabling more expressive and modular code when dealing with specific input cases.
