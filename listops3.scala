def main(args: Array[String]): Unit = {
    val xs = (1 to 10).toList
    println(s"xs = $xs")
    println(s"take(xs, 3) = ${xs.take(3)}")
    println(s"drop(xs, 3) = ${xs.drop(3)}")
    println(s"splitAt(xs, 4) = ${xs.splitAt(4)}")
    println(s"slice(xs, 2, 7) = ${xs.slice(2, 7)}")
    println(s"takeRight(xs, 3) = ${xs.takeRight(3)}")
    println(s"dropRight(xs, 3) = ${xs.dropRight(3)}")
    println(s"grouped(xs, 4) = ${xs.grouped(4).toList}")
    println(s"sliding(xs, 3) = ${xs.sliding(3).toList}")
    println(s"sliding(xs, 3, 2) = ${xs.sliding(3, 2).toList}")
}
