package chapter5;

public class CompareStrings {

	public static void main(String[] args)
	{
		String str1 = "Hello";
		String str2 = "Hello";//This points to str1 
		
		if (str1 == str2)//In memory str1 == str1 
		{
			System.out.println("They match!");
		}
		else
		{
			System.out.println("They dont match!");
		}
		
		
		String str3 = "hello";

		if (str1 == str3)
		{
			System.out.println("They match!");
		}
		else
		{
			System.out.println("They dont match!");
		}
		
		String part1 = "Hello ";
		String part2 = "World";
		String str4 = part1 + part2;
		String str5 = "Hello World";
		
		if (str4 == str5) //Comparing objects not string value
		{
			System.out.println("They match!");
		}
		else
		{
			System.out.println("They dont match!");
		}
		
		if (str4.equals(str5)) //When compare strings use .equals() OR .equlsIgnoreCase()
		{
			System.out.println("They match!");
		}
		else
		{
			System.out.println("They dont match!");
		}
		
	}

}
