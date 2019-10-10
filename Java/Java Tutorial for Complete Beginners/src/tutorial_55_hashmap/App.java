package tutorial_55_hashmap;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		/*
		 * Key value pairs
		 */
		
		/*
		 * You can use any Object for keys and values
		 * 		- You have to make sure your implementing  hashcode() and equals()
		 */
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		//Lookup table
		//Autoboxing to non primitive type
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		
		
		map.put(6, "Hello");
		/*
		 * you can't have duplicate keys in map -> you will override old value if you do 
		 */
		String text = map.get(6);
//		Null will be on list if it does not exist
//		String text = map.get(412);
		
		System.out.println(text);
		
		/*
		 * HASHMAP DOES NOT MAINTAIN ORDER
		 */
		
		
		//Iterating over HashMap
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}
	 

}
