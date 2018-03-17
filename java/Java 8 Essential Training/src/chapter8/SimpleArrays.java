package chapter8;

import java.util.Arrays;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class SimpleArrays
{

	public static void main(String[] args) 
	{
		System.out.println("Array of primitives");
		int[] ints = {3,6,9}; //After [] datatype is recomended. int[] ints = {3,6,9};
		Arrays.sort(ints);
		for (int i = 0; i < ints.length; i++) 
		{
			System.out.println(ints[i]);
		}
		System.out.println("Array of strings");
		String[] strings = {"Red", "Green","Blue"};
		Arrays.sort(strings); // In alphabetical order
		for (String color : strings) 
		{
			System.out.println(color);
		}
		
		System.out.println("Setting initial size");
		int[] sized = new int[10];
		for (int i = 0; i < sized.length; i++) {
			sized[i] = i * 100;
		}
		for (int value : sized)
		{
			System.out.println(value);
		}
		System.out.println("Copying an array");
		int[] copied = new int[5];
		System.arraycopy(sized, 5, copied, 0, 5);//Array copy
		for (int value : copied) {
			System.out.println(value);
		}
	}

}
