package Day6; 
 
public class Box { 
    int length; 
} 
 
class BoxTest { 
    public sta c void modifyBox(Box b) { 
        b.length = b.length + 10; 
    } 
 
    public sta c void main(String[] args) { 
        Box box = new Box(); 
        box.length = 20; 
        System.out.println("Before: " + box.length); 
        modifyBox(box); 
        System.out.println("A er: " + box.length); 
    } 
} 