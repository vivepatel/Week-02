public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor


    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        if (other != null) {
            this.guestName = other.guestName;
            this.roomType = other.roomType;
            this.nights = other.nights;
        }
    }

    // Getters and setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Using the default constructor


        // Using the parameterized constructor
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("\nParameterized Booking:");
        booking2.displayBookingDetails();

        // Using the copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nCopied Booking:");
        booking3.displayBookingDetails();

        // Modifying the copied booking to verify independence
        booking3.setGuestName("Jane Smith");
        booking3.setRoomType("Suite");
        booking3.setNights(5);
        System.out.println("\nModified Copied Booking:");
        booking3.displayBookingDetails();

        // Displaying the original booking to confirm it remains unchanged
        System.out.println("\nOriginal Booking After Modification:");
        booking2.displayBookingDetails();
    }
}
