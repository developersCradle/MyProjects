package tutorial_57_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Sets stores only unique elements
 */

public class App {

	public static void main(String[] args) {
		
		
			// HahsSet does not retain order.
//			Set<String> set1 = new HashSet<String>();
			
			// LinkedHashSet remembers the order you added items in
//			Set<String> set1 = new LinkedHashSet<String>();
			
			// TreeSet sorts in natural order
			Set<String> set1 = new TreeSet<String>();
			
			set1.add("dog");
			set1.add("cat");
			set1.add("mouse");
			set1.add("snake");
			set1.add("bear");
			
			
			if (set1.isEmpty()) {
				System.out.println("Set is empty");
			}
		
			
			//Adding duplicate items does nothing.
			set1.add("mouse"); //Set ONLY contains unique items
			
			//We can easily print set
			System.out.println(set1);
			
			
			///////// ITERATION ////////////////
			
			for (String elemnt : set1) {
				System.out.println(elemnt);
			}

			
			
			/////////////// Does set contains a given item? //////////
			// - Sets are kind of optimized for such thing
			
			if (set1.contains("aAdasds")) {
				System.out.println("Contains aAdasds");
			}
			
			if (set1.contains("cat")) {
				System.out.println("Contains cat");
			}
			
			
		
			// set2 contains some common elements with set1, and some new
			
			Set<String> set2 = new TreeSet<String>();
			
			set2.add("dog");
			set2.add("cat");
			set2.add("giraffe");
			set2.add("moneky");
			set2.add("ant");
			
			/*
			 * HahsSet is most light weight set what you can use
			 */
			Set<String> intersection = new HashSet<String>(set1);
		
			/////////////////Intersection/////////////////////

			System.out.println(intersection);
			
			
			intersection.retainAll(set2); //Keeps only elements of intersection
			
			System.out.println(intersection);
			
			
			///////////////Difference////////////////////////////
			
			Set<String> difference = new HashSet<String>(set1);
			
			difference.removeAll(set2);//Removes all the elements which are in set2
		
			System.out.println(difference);
		}
	
	
	
	}
	 

