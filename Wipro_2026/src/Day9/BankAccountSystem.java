package Day9;

class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount);
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.deposit(500));
        Thread t2 = new Thread(() -> account.withdraw(700));
        Thread t3 = new Thread(() -> account.withdraw(900));

        t1.start();
        t2.start();
        t3.start();
    }
}
