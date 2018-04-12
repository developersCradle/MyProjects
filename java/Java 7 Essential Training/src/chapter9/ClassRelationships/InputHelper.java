package chapter9.ClassRelationships;

import java.util.Scanner;

public class InputHelper
{
  	public String getInput(String prompt) //Instance method of InputHelper Class
		{
			System.out.print(prompt);
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		}
}
