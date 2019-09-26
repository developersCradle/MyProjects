package tutorial_53_arrayList_arrays_the_easy_way;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//Members in collections are Template classes, we cannot put primitive types to Template classes
		//You need to tell <TYPE> or types what you are storing in this element
		ArrayList<Integer> numbers = new ArrayList<Integer>();//In constructor you could specify size
		
		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		
		System.out.println("\nIteration #1: ");
		//index for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		
		//Removing items (careful!)
		//Removing from end, fast
		numbers.remove(numbers.size() - 1);
		
		
		//Removing from beginning, slow
		//This is VERY slow
		numbers.remove(0);
		
		/*
		 * Removing from beginning of array list, need to move all other items to fill the removed spot
		 * If need remove from beginning or middle, use linked list<
		 */
		
		System.out.println("\nIteration #2: ");
		for(Integer value : numbers)
		{
			System.out.println(value);
		}
	
		
		
		//List interface ....
		//Collections use interfaces to group things up
		List<String> values = new ArrayList<String>();
		

	}
	 

}
