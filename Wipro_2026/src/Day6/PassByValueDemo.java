package Day6; 
 
public class PassByValueDemo { 
    public sta c void changeValue(int x) { 
        x = x + 10; 
        System.out.println("Inside method: " + x); 
    } 
 
    public sta c void main(String[] args) { 
        int num = 5; 
        System.out.println("Before method call: " + num); 
        changeValue(num); 
        System.out.println("A er method call: " + num); 
    } 
}