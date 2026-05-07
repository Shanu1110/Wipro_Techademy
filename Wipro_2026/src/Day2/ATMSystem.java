package Day2;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
