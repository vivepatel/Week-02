package singleinheritance.smarthomedevices;

// Subclass: Thermostat, inheriting from Device
class Thermostat extends Device {
    protected int temperatureSetting; // Specific attribute for thermostat: temperature setting

    // Constructor to initialize the Thermostat class
    public Thermostat(int deviceID, String status, int temperatureSetting) {
        // Call the constructor of the superclass (Device)
        super(deviceID, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override the displayStatus method to include thermostat-specific information
    @Override
    public void displayStatus() {
        // Call the superclass method to display device ID and status
        super.displayStatus();
        // Add thermostat-specific details
        System.out.println(" The Temperature Setting is: " + temperatureSetting);
    }
}