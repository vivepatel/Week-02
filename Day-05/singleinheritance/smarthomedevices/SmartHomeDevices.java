package singleinheritance.smarthomedevices;


// Main class to demonstrate single inheritance
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Create an instance of Thermostat
        Thermostat thermostat = new Thermostat(55, "on", 22); // Example: device ID is 55, status is "on", temperature is 22

        // Call the displayStatus method to display the details of the thermostat
        thermostat.displayStatus();
    }
}
