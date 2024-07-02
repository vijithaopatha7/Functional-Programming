object Q2 extends App {
    def filterStrings(list: List[String]): List[String] = {
        list.filter(_.length > 5)
    }

    val list = List("apple", "cherry", "papaya", "orange", "banana", "mango")
    println(filterStrings(list))
}