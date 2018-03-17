package chapter7;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String intput = sc.nextLine();
		int monthNumber = Integer.parseInt(intput);
		
		switch (monthNumber) //Java 7 -> can work with strings
		{
		case 1:
			System.out.println("The mont is January");
			break;
		case 2:
			System.out.println("The mont is February");
			break;
		case 3:
			System.out.println("The mont is March");
			break;

		default:
			break;
		}

	}

}
