object Q4 extends App {

    def attendees (price : Int) : Int = 120 + ((15 - price) / 5) * 20
    
    def earn (price : Int) : Int = attendees (price) * price 

    def cost (price : Int) : Int = 500 + 3 * attendees (price)
    
    def profit (price : Int) : Int = earn (price) - cost (price)

    println("Enter the price: ")
    var price = scala.io.StdIn.readInt ()

    printf ("Profit for ticket price Rs. %d = Rs. %d", price, profit (price))
}