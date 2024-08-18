object Q2 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide an integer as an argument.")
    } else {
      val input = args(0).toInt

      val classifyNumber: Int => String = {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }
      println(classifyNumber(input))
    }
  }
}
