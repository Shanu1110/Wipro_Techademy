package Day1;
import java.util.Scanner;
public class pos_neg {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }

}
