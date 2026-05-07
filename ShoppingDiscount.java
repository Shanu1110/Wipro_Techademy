package Day2;

import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount >= 5000) {
            discount = 0.20; //  for 20%
        } else if (amount >= 2000) {
            discount = 0.10; // for 10%
        } else if (amount >= 1000) {
            discount = 0.05; // for 5%
        }

        double finalAmount = amount - (amount * discount);
        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Final amount to pay: " + finalAmount);
    }
}

