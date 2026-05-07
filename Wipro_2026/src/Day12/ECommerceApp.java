package Day12;

import java.io.*;

public class ECommerceApp {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("orders.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("OrderID: 101 | Product: Laptop | Invoice: INV-2026 | Shipping: Kolkata");
        bw.newLine();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("orders.txt"));
        System.out.println("Order Records:");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
