package tutorial_43_try_with_resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {

		File file = new File("test.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String line;
			while( (line = br.readLine()) != null)// One way to read 
			{
				System.out.println(line);				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file" + file.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
			e.printStackTrace();
		}
		
	}

}
