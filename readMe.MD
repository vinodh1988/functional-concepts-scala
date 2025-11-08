### Scala Iterative Statements

### Nothing Type in Scala

The `Nothing` type in Scala is a special type that represents the absence of a value. It is a subtype of all other types, which means a value of type `Nothing` can be assigned to any other type. However, there are no actual instances of `Nothing`, as it is primarily used to signal abnormal termination or unreachable code.

#### Use Cases of `Nothing`
1. **Exception Handling**: The `Nothing` type is used in methods that throw exceptions to indicate that the method does not return normally:
    ```scala
    def fail(message: String): Nothing = throw new RuntimeException(message)
    ```

2. **Empty Collections**: The `Nothing` type is used as the type parameter for empty collections, making them compatible with collections of any type:
    ```scala
    val emptyList: List[Nothing] = List()
    val intList: List[Int] = emptyList // This works because Nothing is a subtype of Int
    ```

3. **Type Inference**: It helps the Scala compiler infer types in certain scenarios where no value is returned.

#### Key Characteristics of `Nothing`
- **Subtype of All Types**: This makes it useful for type inference and generic programming.
- **No Instances**: You cannot create an instance of `Nothing`.
- **Signals Abnormal Termination**: It is often used to indicate that a method does not return normally, such as methods that throw exceptions.

The `Nothing` type is a powerful tool in Scala's type system, enabling more expressive and type-safe code.

