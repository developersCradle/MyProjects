package chapter5;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) 
	{
		Locale locale = new Locale("fi", "FI");
		double doubleValue = 1_234_567.89; // _ are for readability and are ignore by the compiler
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		System.out.println("Number: " + numberFormat.format(doubleValue)); //Separator can wary -> use local 
		
		
		NumberFormat curF = NumberFormat.getCurrencyInstance();
		System.out.println("Currency: " + curF.format(doubleValue));
		
		NumberFormat intF = NumberFormat.getIntegerInstance();
		System.out.println("Integer: " + intF.format(doubleValue));
		
	}

}
