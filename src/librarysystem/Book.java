package librarysystem;
/**
 * Represents a book in the library system.
 * Each book has an ID, a title, an author, and a borrowed status.
 */
public class Book {
    // Unique ID of the book (could represent ISBN)
    public int id;
    // Title of the book
    public String title;
    // Author of the book
    public String author;
    // Indicates whether the book is currently borrowed
    public boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
}
