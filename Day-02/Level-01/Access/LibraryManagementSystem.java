// Base class: Booknew
 class Booknew {
    // Public member
    public String ISBN;

    // Protected member
    protected String title;

    // Private member
    private String author;

    // Constructor
    public Booknew(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author
    public String getAuthor() {
        return author;
    }

    // Public method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Booknew {
    private double fileSize; // Additional attribute for EBook

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call the superclass constructor
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        // Accessing the protected member `title` from the base class
        System.out.println("ISBN: " + ISBN);  // Accessing the public member `ISBN`
        System.out.println("Title: " + title); // Accessing the protected member `title`
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Author: " + getAuthor()); // Access private `author` via getter method
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating a Booknew object
        Booknew book1 = new Booknew("978-3-16-148410-0", "Java Programming", "John Doe");
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Modifying author name using setter
        book1.setAuthor("Jane Smith");
        System.out.println("\nUpdated Book Details:");
        book1.displayBookDetails();

        // Creating an EBook object
        EBook ebook1 = new EBook("978-1-23-456789-0", "Advanced Java", "Mark Lee", 25.5);
        System.out.println("\nEBook Details:");
        ebook1.displayEBookDetails();
    }
}
