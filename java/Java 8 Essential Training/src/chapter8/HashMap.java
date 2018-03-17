package chapter8;

import java.util.Map;

public class HashMap {

	public static void main(String[] args)
	{
		Map<String, String> map = new java.util.HashMap<>();
		
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		
		map.put("Alaska", "Juneau");
		System.out.println(map);

		String cap = map.get("Oregon");
		System.out.println("The capitol of Oregon is " + cap);
		
		map.remove("California");
		System.out.println(map);

	}

}
