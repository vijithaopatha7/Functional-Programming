object InventorySystem {
    case class Product(name: String, quantity: Int, price: Double)

    def main(args: Array[String]): Unit = {
    val inventory1: Map[Int, Product] = Map(
        101 -> Product("ProductA", 10, 50.0),
        102 -> Product("ProductB", 5, 30.0),
        103 -> Product("ProductC", 20, 40.0)
    )

    val inventory2: Map[Int, Product] = Map(
        102 -> Product("ProductB", 10, 35.0),
        104 -> Product("ProductD", 7, 60.0)
    )

    val productNames = inventory1.values.map(_.name).toList
    println(s"Product Names: $productNames")
    val totalValue = inventory1.values.map(p => p.quantity * p.price).sum
    println(s"Total Value: $totalValue")

    val isEmpty = inventory1.isEmpty
    println(s"Is Inventory Empty: $isEmpty")

    val mergedInventory = inventory1 ++ inventory2.map { case (id, product) =>
        id -> inventory1.get(id).map { existingProduct =>
        Product(
            existingProduct.name,
            existingProduct.quantity + product.quantity,
            Math.max(existingProduct.price, product.price)
        )
        }.getOrElse(product)
    }

    println("Merged Inventory:")
    mergedInventory.foreach { case (id, product) =>
        println(s"ID: $id, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
    }

    val productId = 102
    val productExists = inventory1.get(productId)

    productExists match {
        case Some(product) => println(s"Product ID: $productId, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
        case None => println(s"Product with ID $productId does not exist")
    }
    }
}
