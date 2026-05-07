package Day5;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Final Keyword Demonstration ===");

        // Case 1: Immutable Account Number
        BankAccount account = new BankAccount("ACC12345");
        System.out.println("Account Number: " + account.getAccountNumber());

        // Case 2: Prevent Method Overriding
        CreditCardPayment payment = new CreditCardPayment();
        payment.processPayment(250.75);
        payment.additionalVerification();

        // Case 3: Restrict Inheritance
        SecurityModule security = new SecurityModule();
        security.encryptData("SensitiveInfo123");
    }
}
