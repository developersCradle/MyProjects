package tutorial_48_recursion_useful_trick_up_your_sleeve;

public class App {

	
	public static void main(String[] args) {
	
		//E.g 4! = 4*3*2*1 (factorial 4)
		//Mathematics factorial
		System.out.println(factorial(4));
	}
	
	
	private static int  factorial(int value)
	{
		
		System.out.println(value);
		
		
		if (value == 1) {
			return 1;
		}
		return factorial(value - 1) * value;
	}
}
	
