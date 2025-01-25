package singleinheritance.smarthomedevices;

// Base class: Device
class Device {
    protected int deviceID; // Unique ID for the device
    protected String status; // Status of the device (e.g., "on" or "off")

    // Constructor to initialize the Device class
    public Device(int deviceID, String status) {
        this.deviceID = deviceID;
        this.status = status;
    }

    // Method to display the status of the device
    public void displayStatus() {
        System.out.print("Device ID: " + deviceID + " Device Status: " + status);
    }
}
