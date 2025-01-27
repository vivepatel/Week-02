package encapsulationandpolymorphism.hospitalpatientmangement;

import java.util.ArrayList;
import java.util.List;

// Main class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Creating a list of patients
        List<Patient> patients = new ArrayList<>();

        // Adding InPatient and OutPatient
        InPatient inPatient = new InPatient("P001", "John Doe", 45, 2000, 5);
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 30, 500);

        patients.add(inPatient);
        patients.add(outPatient);

        // Adding medical records
        inPatient.addRecord("Admitted for surgery.");
        inPatient.addRecord("Recovery progressing well.");

        outPatient.addRecord("Visited for a routine checkup.");

        // Displaying patient details and bills
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill Amount: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                System.out.println("Medical Records: " + ((MedicalRecord) patient).viewRecords());
            }

            System.out.println();
        }
    }
}