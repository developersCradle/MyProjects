package tutorial_34_using_generics;

import java.util.ArrayList;
import java.util.HashMap;


class Animal
{
	
}
/*
 * Generic class is class, which can work with other classes. You specify this at instantiation step
 */

public class App {
	
	
	public static void main(String[] args) {
		
		//Arraylist is manages array internally, no need to worry about size
		
		///////////////////// Before Java 5 //////////////////////////////
		ArrayList list = new ArrayList(); // Now we have object which can store other objects
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(1);
		
		System.out.println(fruit);
		
		
		/////////////////////////// Modern style  ///////////////////////////
		/*
		 * ArrayList is parameterized class, generic class
		 */
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("Cat");
		strings.add("Dog");
		strings.add("Alligator");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		/////////////////// There can be more than one argument ////////////
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		/////////////////// Java 7 style //////////////////////////////////
		
		ArrayList<Animal> somelist = new ArrayList<>();//No need to re-write parameters
	}

	
}
