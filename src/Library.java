import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    int id;
    String title;
    String author;
    boolean isBorrowed;

    public static void main(String[] args) {

        ArrayList<Library> books = new ArrayList<>();

        // Sample book
        Library book = new Library();
        book.id = 1;
        book.title = "Sample Title";
        book.author = "Sample Author";
        book.isBorrowed = false;
        books.add(book);

        Scanner scanner = new Scanner(System.in);

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

                case 1:
                    Library newBook = new Library();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter book title: ");
                    newBook.title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    newBook.author = scanner.nextLine();

                    System.out.print("Enter book ID (ISBN): ");
                    newBook.id = scanner.nextInt();

                    newBook.isBorrowed = false;
                    books.add(newBook);

                    System.out.println("✅ Book added successfully!");
                    break;

                case 2:
                    System.out.println("📖 Listing all books...");
                    for (Library b : books) {
                        System.out.println("ID: " + b.id);
                        System.out.println("Title: " + b.title);
                        System.out.println("Author: " + b.author);
                        System.out.println("Borrowed: " + b.isBorrowed);
                        System.out.println("----------------------------");
                    }
                    break;

                case 3:
                    System.out.print("🔍 Enter book ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean foundSearch = false;

                    for (Library b : books) {
                        if (b.id == searchId) {
                            System.out.println("📚 Book found: " + b.title + " by " + b.author);
                            foundSearch = true;
                            break;
                        }
                    }

                    if (!foundSearch) {
                        System.out.println("❌ Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("🔐 Enter book ID to borrow: ");
                    int borrowId = scanner.nextInt();
                    boolean foundBorrow = false;

                    for (Library b : books) {
                        if (b.id == borrowId) {
                            foundBorrow = true;
                            if (!b.isBorrowed) {
                                b.isBorrowed = true;
                                System.out.println("✅ You have borrowed: " + b.title);
                            } else {
                                System.out.println("⚠️ This book is already borrowed.");
                            }
                            break;
                        }
                    }

                    if (!foundBorrow) {
                        System.out.println("❌ Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("📤 Enter book ID to return: ");
                    int returnId = scanner.nextInt();
                    boolean returned = false;

                    for (Library b : books) {
                        if (b.id == returnId) {
                            if (b.isBorrowed) {
                                b.isBorrowed = false;
                                System.out.println("✅ Book returned successfully.");
                            } else {
                                System.out.println("⚠️ This book was not borrowed.");
                            }
                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("❌ Book not found.");
                    }
                    break;

                case 0:
                    System.out.println("👋 Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }

        } while (choice != 0);
    }
}
