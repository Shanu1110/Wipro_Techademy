package Day12;

import java.io.*;

public class HospitalApp {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("patients.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("PatientID: P001 | Name: Rahul | Diagnosis: Flu | Report: Rest & Medication");
        bw.newLine();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
        System.out.println("Patient Records:");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
