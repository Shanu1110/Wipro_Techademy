package Day3;

public class Main {

    static class Employee {
        private double salary;

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary > 0) {
                this.salary = salary;
            }
        }
    }

    static class BankAccount {
        private double balance;

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    static class Car {
        private boolean engineOn;
        private int speed;
        private double fuelLevel;

        public void startEngine() {
            engineOn = true;
        }

        public void stopEngine() {
            engineOn = false;
            speed = 0;
        }

        public void accelerate(int increment) {
            if (engineOn && fuelLevel > 0) {
                speed += increment;
                fuelLevel -= 0.5;
            }
        }

        public void refuel(double amount) {
            fuelLevel += amount;
        }

        public int getSpeed() {
            return speed;
        }

        public double getFuelLevel() {
            return fuelLevel;
        }
    }

    static class Patient {
        private String name;
        private String healthInfo;

        public Patient(String name, String healthInfo) {
            this.name = name;
            this.healthInfo = healthInfo;
        }

        public String getName() {
            return name;
        }

        public String getHealthInfo(boolean authorized) {
            if (authorized) {
                return healthInfo;
            } else {
                return "Access Denied";
            }
        }
    }

    static class Voter {
        private String voterId;
        private boolean hasVoted;

        public Voter(String voterId) {
            this.voterId = voterId;
            hasVoted = false;
        }

        public boolean vote() {
            if (!hasVoted) {
                hasVoted = true;
                return true;
            }
            return false;
        }

        public boolean hasVoted() {
            return hasVoted;
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Employee Salary: " + emp.getSalary());

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(300);
        System.out.println("Bank Balance: " + account.getBalance());

        Car car = new Car();
        car.refuel(10);
        car.startEngine();
        car.accelerate(20);
        System.out.println("Car Speed: " + car.getSpeed());
        System.out.println("Car Fuel Level: " + car.getFuelLevel());

        Patient patient = new Patient("Shanu", "Diabetes Type II");
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Health Info (Unauthorized): " + patient.getHealthInfo(false));
        System.out.println("Health Info (Authorized): " + patient.getHealthInfo(true));

        Voter voter = new Voter("V123");
        System.out.println("Vote Cast: " + voter.vote());
        System.out.println("Vote Cast Again: " + voter.vote());
        System.out.println("Has Voted: " + voter.hasVoted());
    }
}