case class Book(title: String, author: String, isbn: String)

object Library {
  var books: Set[Book] = Set(
    Book("1984", "George Orwell", "1234567890"),
    Book("To Kill a Mockingbird", "Harper Lee", "0987654321"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455")
  )

  def addBook(book: Book): Unit = {
    if (!books.exists(_.isbn == book.isbn)) {
      books += book
      println(s"Book added: ${book.title}")
    } else {
      println(s"Book with ISBN ${book.isbn} already exists.")
    }
  }

  def removeBook(isbn: String): Unit = {
    books.find(_.isbn == isbn) match {
      case Some(book) =>
        books -= book
        println(s"Book removed: ${book.title}")
      case None =>
        println(s"No book found with ISBN $isbn.")
    }
  }

  def isBookInLibrary(isbn: String): Boolean = {
    books.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    books.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  def searchBookByTitle(title: String): Unit = {
    books.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title $title.")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = books.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No books found by author $author.")
    }
  }
}

object LibraryApp extends App {
  Library.displayLibrary()
  Library.addBook(Book("Brave New World", "Aldous Huxley", "6677889900"))
  Library.removeBook("0987654321")
  println(s"Is '1984' in the library? ${Library.isBookInLibrary("1234567890")}")
  Library.displayLibrary()
  Library.searchBookByTitle("The Great Gatsby")
  Library.displayBooksByAuthor("George Orwell")
}
