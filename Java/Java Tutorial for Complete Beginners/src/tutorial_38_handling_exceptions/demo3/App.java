package tutorial_38_handling_exceptions.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	//We could throw out of main ultimately
	public static void main(String[] args) throws FileNotFoundException {
		openFile();

	}
	
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");
		FileReader fr = new FileReader(file); 

	}
	

}
