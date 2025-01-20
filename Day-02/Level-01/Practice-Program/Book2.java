public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Default constructor
    public Book2() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.available = true;
    }

    // Parameterized constructor
    public Book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println("The book \"" + title + "\" has been successfully borrowed.");
            return true;
        } else {
            System.out.println("The book \"" + title + "\" is currently not available.");
            return false;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Creating book objects
        Book2 book1 = new Book2("To Kill a Mockingbird", "Harper Lee", 15.99, true);
        Book2 book2 = new Book2("1984", "George Orwell", 12.50, false);

        // Displaying book details
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();

        // Attempting to borrow books
        System.out.println("\nBorrowing Book 1:");
        book1.borrowBook();

        System.out.println("\nBorrowing Book 2:");
        book2.borrowBook();

        // Displaying updated availability
        System.out.println("\nUpdated Book 1 Details:");
        book1.displayBookDetails();
    }
}
