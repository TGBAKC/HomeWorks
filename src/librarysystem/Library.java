package librarysystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents the main Library system.
 * It allows users to add, list, search, borrow, and return books.
 * All interactions happen via the console.
 */
public class Library {

    // List of books in the library
    private ArrayList<Book> books = new ArrayList<>();

    // Scanner for reading user input
    private Scanner scanner = new Scanner(System.in);

    /**
     * Starts the library menu loop.
     * Users can choose actions such as adding, listing, searching,
     * borrowing, or returning books, or exiting the program.
     */
    public void start() {
        int choice;

        do {
            System.out.println("\n📚 Welcome to the Library Management System");
            System.out.println("1 → Add a book");
            System.out.println("2 → List all books");
            System.out.println("3 → Search for a book");
            System.out.println("4 → Borrow a book");
            System.out.println("5 → Return a book");
            System.out.println("0 → Exit");
            System.out.print("Please select an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addBook();       // Add a new book
                case 2 -> listBooks();     // List all books
                case 3 -> searchBook();    // Search by ID or title
                case 4 -> borrowBook();    // Borrow a book
                case 5 -> returnBook();    // Return a borrowed book
                case 0 -> System.out.println("👋 Exiting the system. Goodbye!");
                default -> System.out.println("⚠️ Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }

    /**
     * Prompts user for book details and adds it to the library.
     */
    private void addBook() {
        scanner.nextLine(); // consume newline
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        System.out.print("Enter book ID (ISBN): ");
        int id = scanner.nextInt();

        Book newBook = new Book(id, title, author);
        books.add(newBook);

        System.out.println("✅ Book added successfully!");
    }

    /**
     * Lists all books currently in the library.
     */
    private void listBooks() {
        System.out.println("📖 Listing all books...");
        for (Book b : books) {
            System.out.println("ID: " + b.id);
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("Borrowed: " + b.isBorrowed);
            System.out.println("----------------------------");
        }
    }

    /**
     * Allows the user to search for a book by ID or title.
     */
    private void searchBook() {
        System.out.println("Search by:\n1 → Book ID\n2 → Book Title");
        int option = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (option == 1) {
            System.out.print("🔍 Enter book ID to search: ");
            int searchId = scanner.nextInt();
            boolean found = false;

            for (Book b : books) {
                if (b.id == searchId) {
                    System.out.println("📚 Book found: " + b.title + " by " + b.author);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("❌ Book not found.");
            }

        } else if (option == 2) {
            System.out.print("🔍 Enter book title to search: ");
            String titleSearch = scanner.nextLine().toLowerCase();
            boolean found = false;

            for (Book b : books) {
                if (b.title.toLowerCase().contains(titleSearch)) {
                    System.out.println("📚 Book found: " + b.title + " by " + b.author);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("❌ No book found with that title.");
            }

        } else {
            System.out.println("⚠️ Invalid option.");
        }
    }

    /**
     * Lets the user borrow a book by ID if it's not already borrowed.
     */
    private void borrowBook() {
        System.out.print("🔐 Enter book ID to borrow: ");
        int borrowId = scanner.nextInt();
        boolean found = false;

        for (Book b : books) {
            if (b.id == borrowId) {
                found = true;
                if (!b.isBorrowed) {
                    b.isBorrowed = true;
                    System.out.println("✅ You have borrowed: " + b.title);
                } else {
                    System.out.println("⚠️ This book is already borrowed.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Book not found.");
        }
    }

    /**
     * Lets the user return a previously borrowed book by ID.
     */
    private void returnBook() {
        System.out.print("📤 Enter book ID to return: ");
        int returnId = scanner.nextInt();
        boolean found = false;

        for (Book b : books) {
            if (b.id == returnId) {
                found = true;
                if (b.isBorrowed) {
                    b.isBorrowed = false;
                    System.out.println("✅ Book returned successfully.");
                } else {
                    System.out.println("⚠️ This book was not borrowed.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Book not found.");
        }
    }
}
