object Q4 extends App {
    def sumEvenNumbers(list: List[Int]): Int = {
        list.filter(_ % 2 == 0).sum
    }

    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(sumEvenNumbers(list))
}