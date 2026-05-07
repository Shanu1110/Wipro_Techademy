package Day5;

public class PaymentApp {
    public static void main(String[] args) {
        CreditCardPayment payment = new CreditCardPayment();
        payment.processPayment(250.75);   // Calls final method from PaymentSystem
        payment.additionalVerification(); // Custom method in CreditCardPayment
    }
}
