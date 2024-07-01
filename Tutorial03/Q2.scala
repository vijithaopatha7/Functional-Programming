object Q2 extends App {
    def filterStrings(list: List[String]): List[String] = {
        list.filter(_.length > 5)
    }

    val list = List("Hello", "World", "Scala", "Programming", "Language", "Functional", "Object", "Oriented")
    println(filterStrings(list))
}