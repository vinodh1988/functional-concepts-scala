object AnonymousBlockInFun {
    def compute(): Int = {
        println("Computing...")
        42
    }

    lazy val alter: Int = {
        println("Inside anonymous block")
        30
    }
    def printTwice(x: => Int): Unit = {
        println(x)  // first evaluation
        println(x)  // second evaluation
    }

    def main(args: Array[String]): Unit = {
        printTwice(compute())
        printTwice(alter)
    }
}