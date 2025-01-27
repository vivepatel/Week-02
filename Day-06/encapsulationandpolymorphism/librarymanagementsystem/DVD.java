package encapsulationandpolymorphism.librarymanagementsystem;

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration for DVDs
    }

    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
