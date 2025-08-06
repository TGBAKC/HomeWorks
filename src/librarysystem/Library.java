package librarysystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

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
                case 1 -> addBook();
                case 2 -> listBooks();
                case 3 -> searchBook();
                case 4 -> borrowBook();
                case 5 -> returnBook();
                case 0 -> System.out.println("👋 Exiting the system. Goodbye!");
                default -> System.out.println("⚠️ Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }

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

    private void searchBook() {
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
    }

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
