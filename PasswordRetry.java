package Day2;

import java.util.Scanner;

public class PasswordRetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "java123";
        int attempts = 3;

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();
            if (input.equals(correctPassword)) {
                System.out.println("Access granted!");
                return;
            } else {
                System.out.println("Incorrect password. Attempts left: " + (attempts - i - 1));
            }
        }
        System.out.println("Access denied!");
    }
}

