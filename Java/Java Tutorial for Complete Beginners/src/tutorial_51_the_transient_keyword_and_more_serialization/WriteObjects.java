package tutorial_51_the_transient_keyword_and_more_serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects...");
        
        try(FileOutputStream fs = new FileOutputStream("test.ser"))
        {
        	ObjectOutputStream os = new ObjectOutputStream(fs);
        	
        	Person person = new Person(7, "Person");
        	
        	Person.setCount(88);
        	os.writeObject(person);

        	
        	os.close();
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
       
    
    }

}