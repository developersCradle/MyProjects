package chapter8;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;



public class IteratorList {

    public static void main(String[] args) {

        System.out.println("Ordered data");
        java.util.List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");
        //Iterator used to be common way to loop throught collection
        

        System.out.println("ArrayList iterator");
        Iterator<String> iterator = list.iterator(); // list.iterator() return reference to iterator
        while (iterator.hasNext()) //.hasNext() whether there is data in object which your looping trough
        {
			String value = iterator.next(); //.next() gets reference to next object
			System.out.println(value);
		}
        
        System.out.println("");

       System.out.println("ArrayList ForEach");// For each statement
       for (String value : list) //No need for Iterator object. This litle bit more memory efficient than iterator(no more additional object)
       {
    	   System.out.println(value);
       }
       System.out.println("");
       
       
       System.out.println("Java 8 method reference"); // In Java 8 most efficient!
       list.forEach(System.out::println);// exist only Java 8<=
       //(first class which have static method::name of method)
       System.out.println("");
		
		 System.out.println("Unordered data");
		 Map<String, String> map = new HashMap<String, String>();
		 map.put("California", "Sacramento");
		 map.put("Oregon", "Salem");
		 map.put("Washington", "Olympia");
		 System.out.println(map);
		 System.out.println("");
		
		 System.out.println("HashMap Iterator");
		 Set<String> keys = map.keySet();//First we need to get Set of keys, keyset() returns unique set of keys. Now we can reference items in a map 
		 Iterator<String> iterator1 = keys.iterator();
		 while (iterator1.hasNext())
		 {
			String key = iterator1.next();
			System.out.println("The capitol of " + key + " is " + map.get(key));
		 }
		 System.out.println(""); 
		
		 System.out.println("HashMap ForEach");
		 for (String key : keys)
		 {
			 System.out.println("The capitol of " + key + " is " + map.get(key));
		 }
		 System.out.println("");

    }

}
