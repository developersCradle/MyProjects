package tutorial_56_sorted_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp
{
	
}

public class App {

	public static void main(String[] args) {
		
		/*
		 * To keep HashMap ordered
		 * 	- At the writing time i know 2 of them
		 * 	- LinkedHashMap
		 * 		-Is keeping order
		 * 	- TreeMap
		 * 		- Tree sort things which you add to it usually in natural order
		 *			- Natural order = what you expected like 1,2,3,4... A,B,C...
		 */
		
		

		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
//		You could use interface type anywhere you refer to them
//		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
//		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		 System.out.println(new Temp());
		 //tutorial_56_sorted_map.Temp@15db9742
		 //15db9742 this is hashCode, its used to store things in a hash map

		 
		 /*
		  * These Maps implements Map interface
		  */
		 
		 
		 testMap(linkedHashMap);
		}
	
	
	
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		
		for(Integer key : map.keySet())//We can iterate over set
		{
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}
	
	}
	 

