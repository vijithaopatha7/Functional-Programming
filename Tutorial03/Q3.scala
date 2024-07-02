object Q3 extends App {
    def average(num1: Int, num2: Int): Float = {
        ((num1 + num2).toFloat) / 2
    }

    val num1 = 15
    val num2 = 20
    printf("average : %.2f", average(num1, num2))
}
