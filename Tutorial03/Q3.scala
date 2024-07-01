object Q3 extends App {
    def average(num1: Int, num2: Int): Float = {
        ((num1 + num2).toFloat) / 2
    }

    val num1 = 10
    val num2 = 20
    println(f"The average of $num1 and $num2 is ${average(num1, num2)}%.2f")
}
