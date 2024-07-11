object Q1{
    var itemNames = Array("Apples", "Bananas", "Oranges")
    var itemQuantities = Array(10, 5, 8)


    def displayInventory(): Unit = {
    println("Current Inventory:")
    for (i <- itemNames.indices) {
        println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
    }

    def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
        itemQuantities(index) += quantity
        println(s"Restocked $quantity of $itemName. New quantity: ${itemQuantities(index)}")
    } else {
        println(s"Item $itemName does not exist in the inventory.")
    }
    }

    def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
        if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $itemName. New quantity: ${itemQuantities(index)}")
        } else {
        println(s"Not enough $itemName in stock to sell $quantity.")
        }
    } else {
        println(s"Item $itemName does not exist in the inventory.")
    }
    }

    def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apples", 5)
    sellItem("Bananas", 2)
    sellItem("Oranges", 10)
    restockItem("Pineapples", 3)
    displayInventory()
    }
}
