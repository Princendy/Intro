package com.niitlab.assignments

class Book(
    val id: Int,
    val title: String,
    val author: String,
    val year: Int = 0,
    var isBorrowed: Boolean = false
)

fun Book.describe(): String {
    val status = if (isBorrowed) "Borrowed" else "Available"
    val yearText = if (year > 0) year.toString() else "n/a"
    return "[$id] \"$title\" by $author ($yearText) - $status"
}

class Library{
    private val books = mutableMapOf<Int, Book>()
    private var nextId = 1

    fun addBook(title: String, author: String, year: Int = 0): String {
        if (title.isBlank() || author.isBlank()){
            return "Error: Title or Author cannot be empty."
        }
        val book = Book(nextId++, title.trim(), author.trim(), year)
        books[book.id] = book
        return "Added: ${book.describe()}"
    }

    fun borrowBook (id: Int): String{
        val book = books[id] ?: return "ERROR: No book with ID $id exists." //null safety
        if (book.isBorrowed) return "Sorry, \"${book.title}\" is already borrowed."
        book.isBorrowed = true
        return "You borrowed \"${book.title}\". ENJOY!!"
    }

    fun returnBook(id: Int): String{
        val book = books[id] ?: return "ERROR: No book with ID $id exists." //null safety
        if (!book.isBorrowed) return "ERROR: \"${book.title}\" was not borrowed."
        book.isBorrowed = false
        return "Thanks for returning \"${book.title}\"."

    }

    fun listBooks(){
        if (books.isEmpty()){
            println("The Library has no books yet.")
            return
        }
        for (book in books.values) println(book.describe())
    }

    fun summary(){
        val total = books.size
        val borrowed = books.values.count { it.isBorrowed }
        println("""
            --- Library Summary ---
            Total Books:     $total
            Borrowed Books:  $borrowed
            Available Books: ${total - borrowed}
        """.trimIndent())
    }
}

fun readInt(prompt: String): Int?{
    print(prompt)
    return readlnOrNull()?.toIntOrNull()
}

fun main(){
    val library = Library()

    //Default Books
    library.addBook("Unexpectedly Yours", "JahsDesign", 2026)
    library.addBook("Things Fall Apart", "Chinua Achebe", 1958)
    library.addBook("A Quiet Place", "Prince David", 2010)

    while (true) {
        println("""
            
            ===== Port Harcourt Library =====
            1. Add book
            2. Borrow Book
            3. Return Book
            4. List all Books
            5. Show Summary
            0. Exit
        """.trimIndent()
        )
        print("Choose an option: ")

        when (readlnOrNull()?.trim()) {
            "1" -> {
                print("Title: ")
                val title = readlnOrNull().orEmpty()
                print("Author: ")
                val author = readlnOrNull().orEmpty()
                val year = readInt("Year (press enter to skip): ") ?: 0
                println(library.addBook(title, author, year))
            }

            "2" -> {
                val id = readInt("Book ID to borrow: ")
                println(if (id == null) "Invalid input: enter a number. " else library.borrowBook(id))

            }

            "3" -> {
                val id = readInt("Book ID to return: ")
                println(if (id == null) "Invalid input: enter a number. " else library.returnBook(id))
            }

            "4" -> library.listBooks()
            "5" -> library.summary()
            "0" -> {
                println("Thank you, GOODBYE!")
                return
            }
            else -> println("Invalid option, try again.")
        }
    }
}