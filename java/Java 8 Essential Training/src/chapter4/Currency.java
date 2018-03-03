package chapter4;

import java.math.BigDecimal;

public class Currency {

	public static void main(String[] args) 
	{
		//double 64bit
		
		double value = .012; 
		
		double pSum = value + value + value;
		
		System.out.println("Sum of primitives" + pSum);
		
		String strValue = Double.toString(value);
		System.out.println("strValue: " + strValue );
		
		BigDecimal bigValue = new BigDecimal(strValue);
		
		BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
		System.out.println("Sum of BigDecimals: " + bSum.toString());
	}

}
