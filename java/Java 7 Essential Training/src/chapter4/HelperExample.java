package chapter4;

public class HelperExample {

	public static void main(String[] args)
	{
		double doubleValue = 156.5d; //d tells it is explicit to double
		//double doubleValue = 156.5; Could be interpretended as double or float 
		Double doubleObj = new Double(doubleValue);
		byte byteValue = doubleObj.byteValue();
		int intValue = doubleObj.intValue();
		float floatValue = doubleObj.floatValue();
		String stringValue = doubleObj.toString();//All Java classes have toString()
		
		
		
		
		//All numeric primitives default to 0 
		//int myInt;
		//System.out.println("The value of myInt is " + myInt);
		
	}
	

}
