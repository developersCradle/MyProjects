package tutorial_39_multiple_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {

	public static void main(String[] args) {
		Test test = new Test();

		/*
		try {
			test.run();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}
		*/
		
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {//Was introduced in Java 7
			e.printStackTrace();
		}
		*/
		
		
		/*
		 * All exception derive from parent class Exception
		 */
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 * If you have child exception you need to handle it before parent
		 */ 
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
