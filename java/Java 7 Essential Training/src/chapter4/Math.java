package chapter4;

public class Math
{
	
	public static void main(String args[])
	{
		int intValue1 = 56;
		int intValue2 = 42;
		
		int result1 = intValue1 + intValue2;
		System.out.println("Addition: " + result1);
		
		int result2 = intValue1 - intValue2;
		System.out.println("Subtraction: " + result2);
		
		int result3 = intValue1 * intValue2;
		System.out.println("Multiplication: " + result3);
		
		double result4 = (double) intValue1 / intValue2;	
		System.out.println("Division: " + result4);
		
		double result5 = (double) intValue1 % intValue2;
		System.out.println("Remainder: " + result5);
		
		
		double doubleValue = -3.99999;
		long rounded = java.lang.Math.round(doubleValue);
		System.out.println("Rounded: " + rounded);
		
		double absValue = java.lang.Math.abs(doubleValue);//Absoluuttinen arvo
		System.out.println("Rounded: " + absValue );
	}
	
}
