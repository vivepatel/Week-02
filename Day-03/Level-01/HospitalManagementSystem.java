// Class: Patient
class Patient {
    // Static members
    static String hospitalName = "City Hospital"; // Shared among all patients
    static int totalPatients = 0; // To count the total patients admitted

    // Final variable
    final int patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(String name, int age, String ailment) {
        this.patientID = ++totalPatients; // Unique ID for each patient
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital: " + hospitalName);
    }
}

// Main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating Patient objects
        Patient patient1 = new Patient("Alice", 30, "Fever");
        Patient patient2 = new Patient("Bob", 45, "Diabetes");

        // Display patient details
        System.out.println("Patient Details:");
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

        // Display total patients admitted
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());

        // Instanceof validation
        System.out.println("\nInstanceof Validation:");
        if (patient1 instanceof Patient) {
            System.out.println("Patient1 is an instance of the Patient class.");
        }
        if (patient2 instanceof Patient) {
            System.out.println("Patient2 is an instance of the Patient class.");
        }
    }
}
