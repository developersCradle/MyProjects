package chapter0;
import java.util.Scanner;

public class Chalange_1
{
	/*
		Remember to provide argument!
	*/
	public static void main(String[] args) 
	{
		String firstArg = null;

		if (args.length > 0)
		{
			try   
			{
				firstArg = args[0];

				System.out.println("Enter your name: ");
				Scanner scanner = new Scanner(System.in);
				String name = scanner.nextLine();

				System.out.println("Enter your age: ");
				int age = Integer.parseInt(scanner.nextLine());
				System.out.println("Your age is " + age);
				System.out.println("Your your name is " + name);


			}
			catch(Exception e) 
			{

				System.err.println("error");
				System.exit(1);
			}	

			System.out.println("You entered " +  firstArg);
		}
	}
}