package chapter5;


import java.util.Scanner;
public class StringBuilder {

	public static void main(String[] args)
	{
		String str1 = "Hello";
		String str2 = "Woldl";
		String str3 = str1 + ", " + str2 + "!";
		//3 Objects created! String manipulation can be heavy.
		//Use String builder class
		System.out.println(str3);
		
	
		
		java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
		sb.append(", ");
		sb.append("Wordl");
		sb.append("!");
		System.out.println(sb);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value: ");
		String input = scanner.nextLine(); //Waits for user Enter or Rerturn key
		System.out.println(input);
		
		sb.delete(0,sb.length());
		for (int i = 0; i < 3; i++) 
		{
			input = scanner.nextLine();
			sb.append(input + "\n");
		}
		System.out.println(sb); //sb is converted .toString() automatically
	}

}
