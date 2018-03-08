package chapter5;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesAndTimes {

	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);
		
		GregorianCalendar gc = new GregorianCalendar(2009,1,28);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime();// Returns Date object
		System.out.println(d2);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);//Formatting Date
		System.out.println(df.format(d2));
	
	}	

}
