package Day5;

// Extends PaymentSystem but cannot override processPayment() because it's final
public class CreditCardPayment extends PaymentSystem {
    public void additionalVerification() {
        System.out.println("Performing extra verification for credit card payment...");
    }
}
