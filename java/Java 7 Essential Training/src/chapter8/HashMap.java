package chapter8;

import java.util.Map;

public class HashMap {

	public static void main(String[] args)
	{
		//Hashmap represents UNORDERED data, "key" "value" pairs
		Map<String, String> map = new java.util.HashMap<>();
		//Map<String, String> map = new java.util.HashMap<String>()<- Before Java 7 syntax was. after Java 7 you don't need add declaration again.
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		
		map.put("Alaska", "Juneau");
		System.out.println(map); //Objects toString() is responsible for the formatting
		//Order of data is not guarantee, order can change in each put
		String cap = map.get("Oregon");//Using "key" to get value
		System.out.println("The capitol of Oregon is " + cap);
		
		map.remove("California");
		System.out.println(map);

	}

}
