object PrimeFilter{

    def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else !(2 to Math.sqrt(n).toInt).exists(i => n % i == 0)
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
    }

    def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterPrime(input)
    println(output)
    }
}
