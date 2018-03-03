package chapter4;

public class Characters
{
	public static void main(String[] args)
	{
		char c1 = '1';
		char c2 = '2';
		char c3 = '3';
	
		
		System.out.println("Char 1: " + c1 );
		System.out.println("Char 2: " + c2 );
		System.out.println("Char 3: " + c3 );
		
		char dollarSign = '\u0024'; //Unicode escape sequence
		System.out.println("Currency: " + dollarSign);
		
		char a1 = 'a'; //Chars are primitive types
		char a2 = 'b';
		char a3 = 'c';
		System.out.print(Character.toUpperCase(a1)); //Use Character helper classes to manipulatie and manage them
		System.out.print(Character.toUpperCase(a2));
		System.out.println(Character.toUpperCase(a3));
	}
}
