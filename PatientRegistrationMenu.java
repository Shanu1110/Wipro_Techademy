package Day10;

import java.util.Scanner;

class PatientNode {
    int id;
    PatientNode left, right;

    PatientNode(int id) {
        this.id = id;
        left = right = null;
    }
}

public class PatientRegistrationMenu {
    private PatientNode root;

    // Insert patient into BST
    public PatientNode insert(PatientNode root, int id) {
        if (root == null) {
            System.out.println("✅ Patient added: " + id);
            return new PatientNode(id);
        }

        if (id < root.id) {
            root.left = insert(root.left, id);
        } else if (id > root.id) {
            root.right = insert(root.right, id);
        } else {
            System.out.println("⚠️ Duplicate detected: Patient " + id + " already registered!");
        }
        return root;
    }

    // Search patient
    public boolean search(PatientNode root, int id) {
        if (root == null) return false;
        if (root.id == id) return true;
        if (id < root.id) return search(root.left, id);
        else return search(root.right, id);
    }

    // Inorder traversal to view patients
    public void inorder(PatientNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.id + " ");
            inorder(root.right);
        }
    }

    // Menu-driven program
    public static void main(String[] args) {
        PatientRegistrationMenu system = new PatientRegistrationMenu();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Hospital Patient Registration ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. View All Registered Patients");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID to register: ");
                    int id = sc.nextInt();
                    system.root = system.insert(system.root, id);
                    break;
                case 2:
                    System.out.print("Enter Patient ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = system.search(system.root, searchId);
                    System.out.println(found ? "✅ Patient Found" : "❌ Patient Not Found");
                    break;
                case 3:
                    System.out.println("Unique Registered Patients (sorted):");
                    system.inorder(system.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
