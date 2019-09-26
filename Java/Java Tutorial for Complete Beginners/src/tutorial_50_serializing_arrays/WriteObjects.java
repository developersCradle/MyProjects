package tutorial_50_serializing_arrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects...");

        //array is simply Object in Java, arrays are Serializable as long object in it are Serializable
        Person[] people = {new Person(1, "Sue"), new Person(7, "Bob") };
        
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
        
        try(FileOutputStream fs = new FileOutputStream("people.bin"))
        {
        	ObjectOutputStream os = new ObjectOutputStream(fs);
        	
        	os.writeObject(people);

        	os.writeObject(peopleList);
        	
        	//writing number of Object
        	os.writeInt(peopleList.size());
        	
        	for (Person person : peopleList) {
				os.writeObject(person);
			}
        	
        	
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