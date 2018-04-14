package chapter5;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args)
	{

		System.out.println("Enter a numeric value: ");
		
		Scanner scanner = new Scanner(System.in);
		String var1 = scanner.nextLine().toString();

		System.out.println("Enter a numeric value: ");
		String var2 = scanner.nextLine().toString();
		
		double var_1 = Double.valueOf(var1);
		double var_2 = Double.valueOf(var2);
		
		double answer = var_1 + var_2;
		System.out.println("The answer is: " + answer);

	}

}
