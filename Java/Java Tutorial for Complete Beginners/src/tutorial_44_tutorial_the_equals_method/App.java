package tutorial_44_tutorial_the_equals_method;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		File file = new File("test.txt");
		// Try with resources handles close() automatically
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) // Writing applyes only to txt files
		{
			br.write("This is line one");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("This is line three\n");
			br.write("This is line last line");

		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
			e.printStackTrace();

		}
	}
}
