package tutorial_51_the_transient_keyword_and_more_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/*
 * ReadObject does not call Objects constructor, we want't read object how it was set  
 * Deserialization does not run any constructors
 * THIS IS SITUVATION WHERE YOU GET OBJECT WHITOUT RUNNING ANY COSNTRUCTOR
 */
public class ReadObjects {

    
    public static void main(String[] args) {
        System.out.println("Reading objects...");


        try(FileInputStream fi = new FileInputStream("test.ser"))
        {
        	ObjectInputStream os = new ObjectInputStream(fi);
        	
        	Person person = (Person)os.readObject();
        	System.out.println(person);
        	
        	
        	os.close();
        	
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
    }

}