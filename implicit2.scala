object ImplicitClassExample {
    implicit class RichInt(val x: Int) {
        def square: Int = x * x
        def triple: Int = x * 3
    }

    def main(args: Array[String]): Unit = {
        val num = 5
        println(s"Square of $num: ${num.square}")
        println(s"Triple of $num: ${num.triple}")
    }
}