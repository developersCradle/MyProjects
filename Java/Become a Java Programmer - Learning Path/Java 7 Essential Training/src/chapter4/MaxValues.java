package chapter4;

public class MaxValues {

	public static void main(String[] args) 
	{
		byte b = 127;
		System.out.println("Byte: " + b);	
		//Byte -128 - 127
		//b++;
		
		// Checks if we can ++ b
		if (b < Byte.MAX_VALUE) //Using helper class
		{
			b++;
		}
		System.out.println("Byte: " + b);
		
		// Short -32, 768 - 32, 767
		short sh = 32767;
		//sh++;
		if (sh < Short.MAX_VALUE)
		{
			sh++;
		}
		System.out.println("Short: " + sh);
		
		int i = 1;
		long l = 1L;
		
		float f = 1f;
		double d = 1d;
	
		
		
		
		
		
		
	}

}
