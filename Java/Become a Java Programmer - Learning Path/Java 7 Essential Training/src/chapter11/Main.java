package chapter11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;

public class Main
{
//File I/O
/*
 * Original system I/O  origin ~ 1995
 * 				Or
 * From Java 7, completely new system
 * 
 */
	public static void main(String[] args) 
	{	
		String sourceFile= "C:\\Users\\Heka\\Desktop\\MyProjects\\MyProjects\\java\\Java 7 Essential Training\\src\\chapter11\\files\\loremipsum.txt";;
		String targetFile = "C:\\Users\\Heka\\Desktop\\MyProjects\\MyProjects\\java\\Java 7 Essential Training\\src\\chapter11\\files\\target.txt"; 

		//try-with-resource syntax JAVA 7 
		try(//if try has objects inside(), it means these objects implements method close()
			// by instatianting object here -> we allow Java Runtime to call the close() for me when we are done
				// We declare three closable objects
				FileReader fReader = new FileReader(sourceFile); //No need for ; if only 1 object closable object
				BufferedReader bReader = new BufferedReader(fReader); //Has method readline
				FileWriter writer = new FileWriter(targetFile);
				) {
			
			while (true)
			{
				String line = bReader.readLine();
				if (line == null) //We got something to work for
				{
					break;
				}
				else
				{
					writer.write(line + "\n"); // Readed line + line feed(line feed in read is ignored, so we need put one)
				}
			}
			System.out.println("File copied!");
			
		} catch (Exception e) // Being general here
		{
			e.printStackTrace();
		}
	}

}
