
package Day12;
import java.io.File;
import java.io.IOException;
public class createIO {
public static void main(String[] args)
	{
 
		try {
			
			File file = new File("Shanu.txt");
			if(file.createNewFile())
			{
				System.out.println("File Created Successfully");
		    }
			else
			{
				System.out.println("File Already Exists");
            }
			}
		catch(IOException e)
            {
            	System.out.println(e);
            }
	}
	}
 
 