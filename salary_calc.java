package Day1;


public class salary_calc {
 public static void main(String[] args) {
   
     double basicSalary = 50000.0;
     double bonus = 10000.0;
     double tax = 8000.0;

     double netSalary = basicSalary + bonus - tax;

     System.out.println("Basic Salary: " + basicSalary);
     System.out.println("Bonus: " + bonus);
     System.out.println("Tax: " + tax);
     System.out.println("Net Salary: " + netSalary);
 }
}
