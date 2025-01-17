import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    // Constructor to initialize ticket attributes
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket successfully booked!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input movie details
        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter the seat number: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter the ticket price: ");
        double price = scanner.nextDouble();

        // Create a MovieTicket object and book a ticket
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.bookTicket(movieName, seatNumber, price);

        // Display ticket details
        ticket.displayTicketDetails();

        scanner.close();
    }
}
