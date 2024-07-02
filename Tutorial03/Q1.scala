object Q1{
  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }

  def main(args: Array[String]): Unit= {
    val s = "hello"
    println(reverseString(s))
  }
}