package Day12;

import java.io.*;

//A simple class that can be serialized
class Student implements Serializable {
 private static final long serialVersionUID = 1L; // recommended
 String name;
 int age;

 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

public class SerializationDemo {
 public static void main(String[] args) {
     Student s1 = new Student("John", 22);

     // Serialization: write object to file
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
         out.writeObject(s1);
         System.out.println("Object serialized successfully!");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Deserialization: read object back
     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
         Student s2 = (Student) in.readObject();
         System.out.println("Deserialized Student: " + s2.name + ", " + s2.age);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
