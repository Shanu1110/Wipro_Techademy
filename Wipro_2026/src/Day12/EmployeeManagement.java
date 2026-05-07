package Day12;

import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialize
        Employee emp = new Employee(1, "Shanu", 75000);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        oos.writeObject(emp);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee e = (Employee) ois.readObject();
        ois.close();

        System.out.println("Employee Details: ID=" + e.id + ", Name=" + e.name + ", Salary=" + e.salary);
    }
}
