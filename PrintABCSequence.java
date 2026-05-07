package Day9;

class PrintABC {
    private int state = 0;

    public synchronized void printA() {
        while (true) {
            while (state % 3 != 0) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.print("A ");
            state++;
            notifyAll();
        }
    }

    public synchronized void printB() {
        while (true) {
            while (state % 3 != 1) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.print("B ");
            state++;
            notifyAll();
        }
    }

    public synchronized void printC() {
        while (true) {
            while (state % 3 != 2) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.print("C ");
            state++;
            notifyAll();
        }
    }
}

public class PrintABCSequence {
    public static void main(String[] args) {
        PrintABC printer = new PrintABC();

        new Thread(printer::printA).start();
        new Thread(printer::printB).start();
        new Thread(printer::printC).start();
    }
}
