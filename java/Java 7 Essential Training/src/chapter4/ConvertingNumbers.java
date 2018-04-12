package chapter4;

public class ConvertingNumbers {

	public static void main(String[] args)
	{
		int intValue1 = 56;
		int intValue2 = intValue1;
		System.out.println("The 2nd value is " + intValue2);
		
		
		
		long longValue1 = intValue1; //Widening the type (automatic)
		System.out.println("The long value is " + longValue1);
		
		short shortValue1 = (short)intValue1;//Narrowing the type (need to tell)
		System.out.println("The short value is " + shortValue1);
	
		int intValue3 = 1024;
		byte byteValue = (byte) intValue3;
		
		System.out.println("The byte value is " + byteValue); //Narrowing data, ERROR!
		
		
		double doubleValue = 3.999999d;
		int intValue4 = (int)doubleValue;
		System.out.println("Double to int " + intValue4);
	}	
	
	
	

}
