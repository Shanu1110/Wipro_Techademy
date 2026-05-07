package Day12;

import java.io.*;

public class FoodDeliveryApp {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("delivery.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Restaurant: SpiceHub | Menu: Paneer Tikka | OrderID: 501 | Delivery: Completed");
        bw.newLine();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("delivery.txt"));
        System.out.println("Delivery Logs:");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
