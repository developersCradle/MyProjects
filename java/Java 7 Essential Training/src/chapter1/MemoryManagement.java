package chapter1;

//Memory management and garbage collection

/* TIPS for Managing Memory
 * 
 *  - Minimize the number of objects you create
 *  - To find out memory status:
 *  	Runtime.maxMemory();
 *  	Runtime.totalMemory();
 *  
 *  In cmd you can manage amount of available heap memory: (differs platform to platform)
 *  	java -Xms256s MemoryManagement		//Initial heap size
 *  	java -Xms256m MemoryManagement		//Maximum heap size
 *  	java -Xms256n MemoryManagement		//Heap size for young generation objects
 */


public class MemoryManagement {

	static void changeString()
	{
		String localVar = "I get destroyed when out of scope";
		System.out.println("In function: " + localVar); // Memory manager might remove localVar after out of scope 
	}
	
	public static void main(String[] args)
	{
		
		String tempVar = "I am going to be dereferenced!";
		tempVar = null;	//I will get removed if CG wishes so :c regardless of the scope
		
		//We can request for garbage collection, but no guarantees
		System.gc();
		Runtime.getRuntime().gc();
		
		
		
		changeString();

	}

}
