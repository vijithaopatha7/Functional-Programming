object Q2{
    def main(args: Array[String]): Unit = {
        val input = args(0).toInt
        input match {
            case x if x <= 0 => println("Negative/Zero is input")
            case x if x % 2 == 0 => println("Even number is given")
            case _ => println("Odd number is given")
        }
    }
}


