object Q4 extends App{

    val bookCoverPrice: Double = 24.95
    val totalBooks: Int = 60
    
    //Calculating the total wholesale cost for 60 copies
    val totalBookCoverPrice: Double = bookCoverPrice * totalBooks

    // Applying the discount of 40% on the total book cover price
    val finalTotalBookCoverPrice: Double = totalBookCoverPrice * 0.6
    
    // Calculating the shipping cost for 60 copies
    val shippingCost: Double = 3 + 0.75 * (totalBooks - 50)
    
    // Calculating the total wholesale cost for 60 copies
    val totalCost: Double = finalTotalBookCoverPrice + shippingCost

    println("Total wholesale cost for 60 copies = $" + totalCost)
}