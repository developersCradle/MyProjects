package chapter7;

public class IfElse {

	public static void main(String[] args)
{
		int monthNumber = 8;
		if (monthNumber >= 1 && monthNumber <3) 
		{
			System.out.println("Your in Quarter 1");
		}else if (monthNumber >= 1 && monthNumber <6)
		{
			System.out.println("Your in Quarter 2");
		}else if (monthNumber >= 1 && monthNumber <9)
		{
			System.out.println("Your in Quarter 3");
		}else if (monthNumber >= 1 && monthNumber <12)
		{
			System.out.println("Your in Quarter 4");
		}else {
			System.out.println("Thats an unknow month!");
		}
		
		

	}

}
