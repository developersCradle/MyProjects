package tutorial_38_handling_exceptions.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	
	
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try {
			FileReader fr = new FileReader(file);
			System.out.println("continuing");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
			e.printStackTrace();
		} 
		
		System.out.println("Finished");
	}
	

}
