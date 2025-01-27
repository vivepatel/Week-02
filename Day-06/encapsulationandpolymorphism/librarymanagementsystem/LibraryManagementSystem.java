package encapsulationandpolymorphism.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating a list of library items
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new Magazine("M002", "National Geographic", "Various Authors"));
        items.add(new DVD("D003", "Inception", "Christopher Nolan"));

        // Processing items polymorphically
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available: " + reservableItem.checkAvailability());
                reservableItem.reserveItem();
                System.out.println("Available after reservation: " + reservableItem.checkAvailability());
            }

            System.out.println();
        }
    }
}
