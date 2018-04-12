package chapter5;
/*
 * There is two date API:s in JAVA
 */
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
	
		
		LocalDate ldt = LocalDate.now(); //New date time
		System.out.println(ldt);
		
		LocalDate ld = LocalDate.of(2009, 1, 28);
		System.out.println(ld);
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		System.out.println(dtf.format(ld)); //Looking for TemporalAccessor, super class
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
		System.out.println(dtf2.format(ld));
		
	}	

}
