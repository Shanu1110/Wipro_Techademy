package Day9;

class EvenOddPrinter {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                System.out.println("Odd: " + number);
                number++;
                notify();
            } else {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
                number++;
                notify();
            } else {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}

public class AlternatePrinting {
    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}
