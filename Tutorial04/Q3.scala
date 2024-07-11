object Q3{
    def toUpper(s: String): String = s.toUpperCase()

    def toLower(s: String): String = s.toLowerCase()

    def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

    def main(args: Array[String]): Unit = {
    val names = List(
        ("Benny", toUpper),
        ("Niroshan", (s: String) => s.substring(0, 2).toUpperCase + s.substring(2)),
        ("Saman", toLower),
        ("Kumara", (s: String) => s.substring(0, s.length - 1) + s.last.toUpper)
    )

    names.foreach { case (name, formatFunc) =>
        println(formatNames(name)(formatFunc))
    }
    }
}
