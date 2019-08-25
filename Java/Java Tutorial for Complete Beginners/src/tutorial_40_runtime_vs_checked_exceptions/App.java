package tutorial_40_runtime_vs_checked_exceptions;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class App {

	/*
	 * Two basic kind of exceptions
	 *  Checked exceptions < we are forced to handle
	 *  Unchecked exceptions or Runtime exceptions
	 */
	
	public static void main(String[] args) {
		
		
		/*	//This is Checked exception, we are forced to handle
		try {
			Thread.sleep(33);	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		//Run time exceptions
		//int value = 7;
		
		//value = value / 0; //We are NOT forced to handle
		
		
		//NULL pointer exception, Runtime exception
//		String name = null;
//		System.out.println(name.length());
		
		//Array out of bounds exception, Runtime exception
		String[] texts = {"one", "two", "three"};
		//WE can catch runtime exceptions, but usually we DONT want
		//	this means, we should fix the problem itself
		
		try {//This is not forced to handle
			System.out.println(texts[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) { //Catching specific exception at runtime
			System.out.println(e.toString());
		}
		
		
	}

}
