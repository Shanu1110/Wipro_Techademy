package Day5;

public class BankAccount {
    private final String accountNumber;  // final ensures immutability

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber; // initialized once
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
