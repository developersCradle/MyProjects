package chapter7;

public class CopyOrReference {

	
	static void incrementValue(int[] inMethod)//Copy of array is passed, but its still referencing outer array
	{
		inMethod[0]++;
		System.out.println("In method: " + inMethod[0]);
	}
	
	static void incrementValue(int inMethod)//Copy of primitive is passed
	{
		inMethod++;
		System.out.println("In method: " + inMethod);
	}
	
	public static void main(String[] args)
	{
		int original = 10;
		System.out.println("Original before: " + original);
		incrementValue(original);
		System.out.println("Original after: " + original);
		
		
		int[] aroriginal = {10, 20, 30};
		System.out.println("Original before: " + aroriginal[0]);
		incrementValue(aroriginal);
		System.out.println("Original after: " + aroriginal[0]);
	}

}
