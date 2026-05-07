package Day2;

import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = {30000, 40000, 50000}; // sample data
        System.out.print("Enter increment percentage: ");
        double increment = sc.nextDouble();

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] += salaries[i] * increment / 100;
            System.out.println("Updated salary of employee " + (i+1) + ": " + salaries[i]);
        }
    }
}
