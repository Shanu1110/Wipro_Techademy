package Day5;

import java.util.Scanner;

interface PaymentSystem {

    void pay(double amount);

    default void paymentStatus() {
        System.out.println("Payment completed successfully.");
    }

    default void receipt(double amount, String method) {
        System.out.println("\n----- RECEIPT -----");
        System.out.println("Payment Method : " + method);
        System.out.println("Amount Paid    : Rs. " + amount);
        System.out.println("-------------------");
    }
}

class CreditCardPayment implements PaymentSystem {

    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment...");
        paymentStatus();
        receipt(amount, "Credit Card");
    }
}

class UPIPayment implements PaymentSystem {

    public void pay(double amount) {
        System.out.println("Processing UPI Payment...");
        paymentStatus();
        receipt(amount, "UPI");
    }
}

class CashPayment implements PaymentSystem {

    public void pay(double amount) {
        System.out.println("Processing Cash Payment...");
        paymentStatus();
        receipt(amount, "Cash");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- PAYMENT SYSTEM -----");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        PaymentSystem payment;

        switch (choice) {
            case 1:
                payment = new CreditCardPayment();
                payment.pay(amount);
                break;

            case 2:
                payment = new UPIPayment();
                payment.pay(amount);
                break;

            case 3:
                payment = new CashPayment();
                payment.pay(amount);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}