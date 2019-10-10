package tutorial_59_sorting_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//If you wana sort in another way than natural order
class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		//s1 == s2 return 0
		//first arguments should sort later in the list. s1 > s2  return 1 
		//first arguments should sort earlier in the list. s1 < s2  return -1

		int len1 = s1.length();
		int len2 = s2.length();
		
		
		if (len1 > len2) {
			return 1;
		}
		else if(len1 < len2)
		{
			return -1;
		}
		return 0;
	}
	
}
//10:50

class ReverseAlphabeticalComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		//+1 if s1 > s2
		//-1 if s1 < s2
		//To reverse, we just add negative sign
		return -s1.compareTo(s2); // Defines natural order 
	}
	
}


public class App {

	public static void main(String[] args) {

		
		
		List<String> animals = new ArrayList<String>();
		
		
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");
		
		
		/////////////////////////SORTING ALPHABETICALLY////////////////////////////
		/////////////////////NATURAL ORDER SORTING/////////////////////
		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		

		
		for(String animal : animals)
		{
			System.out.println(animal);
		}
		
		
		
		/////////////////////// Sorts Numerical order/////////////////////
		// /////////////////////NATURAL ORDER SORTING/////////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		
		Collections.sort(numbers);
		
		
		
		for(Integer number : numbers)
		{
			System.out.println(number);
		}
		
		
		
		}
	
	
	
	}
	 

