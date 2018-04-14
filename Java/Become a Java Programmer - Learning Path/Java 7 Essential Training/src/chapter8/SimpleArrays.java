package chapter8;

import java.util.Arrays;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class SimpleArrays
{

	public static void main(String[] args) 
	{
		System.out.println("Array of primitives");
		// int ints[] = {3,6,9}; <- This is also a way to declare array of ints
		int[] ints = {9,6,3}; // Brackets after data type is recommended. int[] ints = {3,6,9};
		//When size is set, size canno't be changed
		Arrays.sort(ints);// Arrays class contains different sorts for different data types
		for (int i = 0; i < ints.length; i++) 
		{
			System.out.println(ints[i]);
		}
		
		System.out.println("Array of strings");
		String[] strings = {"Red", "Green","Blue"};
		Arrays.sort(strings); // In alphabetical order
		//For each loop (what type you will be working on and name for it : where to get values)
		
		for (String color : strings) 
		{
			System.out.println(color);
		}
		
		System.out.println("Setting initial size");
		int[] sized = new int[10]; //If array is set this way -> default values for that data type. 0 for numeric primitives, false for booleans etc.. 
		for (int i = 0; i < sized.length; i++) 
		{
			sized[i] = i * 100;
		}
		for (int value : sized)
		{
			System.out.println(value);
		}
		System.out.println("Copying an array");
		int[] copied = new int[5];
		//(original array, begin position, dest array, begin pos where to copy to, number of items)
		System.arraycopy(sized, 5, copied, 0, 5);//Array copy
		for (int value : copied) {
			System.out.println(value);
		}
	}

}
