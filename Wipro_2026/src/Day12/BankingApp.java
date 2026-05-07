package Day12;

import java.io.*;
import java.util.*;

public class BankingApp {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("transactions.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        // Append transaction
        bw.write("Account: 12345 | Deposit: 5000 | Date: 2026-05-06");
        bw.newLine();
        bw.close();

        // Read account details
        BufferedReader br = new BufferedReader(new FileReader("transactions.txt"));
        String line;
        System.out.println("Transaction History:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
