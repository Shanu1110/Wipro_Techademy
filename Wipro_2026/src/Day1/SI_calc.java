package Day1;


public class SI_calc {
 public static void main(String[] args) {
     
     double principal = 10000.0;  // P
     double rate = 5.0;           // rate in %
     double time = 2.0;           // Time

     double simpleInterest = (principal * rate * time) / 100;

     System.out.println("Simple Interest: " + simpleInterest);
 }
}
