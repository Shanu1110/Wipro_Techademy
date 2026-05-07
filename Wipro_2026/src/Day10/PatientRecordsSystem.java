package Day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Patient {
    int id;
    String name;
    int age;
    String disease;

    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "PatientID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
    }
}

public class PatientRecordsSystem {
    private Map<Integer, Patient> records = new HashMap<>();

    // Add patient
    public void addPatient(Patient p) {
        if (records.containsKey(p.id)) {
            System.out.println("Patient with ID " + p.id + " already exists!");
        } else {
            records.put(p.id, p);
            System.out.println("Patient added: " + p);
        }
    }

    // Update patient
    public void updatePatient(int id, String name, int age, String disease) {
        if (records.containsKey(id)) {
            Patient p = new Patient(id, name, age, disease);
            records.put(id, p);
            System.out.println("Patient updated: " + p);
        } else {
            System.out.println("Patient with ID " + id + " not found!");
        }
    }

    // Retrieve patient
    public void getPatient(int id) {
        Patient p = records.get(id);
        if (p != null) {
            System.out.println("Patient details: " + p);
        } else {
            System.out.println("Patient not found!");
        }
    }

    // Remove patient
    public void removePatient(int id) {
        if (records.remove(id) != null) {
            System.out.println("Patient with ID " + id + " removed.");
        } else {
            System.out.println("Patient not found!");
        }
    }

    // List all patients
    public void listPatients() {
        if (records.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            System.out.println("All Patients:");
            for (Patient p : records.values()) {
                System.out.println(p);
            }
        }
    }

    // Check existence
    public void checkPatient(int id) {
        System.out.println(records.containsKey(id) ? "Patient exists." : "❌ Patient does not exist.");
    }

    // Count total patients
    public void countPatients() {
        System.out.println("Total Patients: " + records.size());
    }

    // Clear system
    public void clearSystem() {
        records.clear();
        System.out.println("All patient records cleared.");
    }

    // Menu-driven program
    public static void main(String[] args) {
        PatientRecordsSystem system = new PatientRecordsSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Hospital Patient Records System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Update Patient");
            System.out.println("3. Retrieve Patient");
            System.out.println("4. Remove Patient");
            System.out.println("5. List All Patients");
            System.out.println("6. Check Patient Existence");
            System.out.println("7. Count Total Patients");
            System.out.println("8. Clear System");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();
                    system.addPatient(new Patient(id, name, age, disease));
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int uage = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String udisease = sc.nextLine();
                    system.updatePatient(uid, uname, uage, udisease);
                    break;
                case 3:
                    System.out.print("Enter ID to retrieve: ");
                    system.getPatient(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter ID to remove: ");
                    system.removePatient(sc.nextInt());
                    break;
                case 5:
                    system.listPatients();
                    break;
                case 6:
                    System.out.print("Enter ID to check: ");
                    system.checkPatient(sc.nextInt());
                    break;
                case 7:
                    system.countPatients();
                    break;
                case 8:
                    system.clearSystem();
                    break;
                case 9:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
