package chapter8;

import java.util.List;


public class ArrayList {

	public static void main(String[] args) 
	{
		
		//Inside <> must be instance of the class. Example if integer use List<Insteger> not the primitive int itself
		List<String> list = new java.util.ArrayList<>(); //<> Diamond operator, generic notation
		list.add("California");
		list.add("Orogon");
		list.add("Washington");
		
		System.out.println(list);

		
		list.add("Alaska");
		System.out.println(list);
		
		list.remove(0);//Removing from list
		System.out.println(list);
		
		String state = list.get(1);//get state
		System.out.println("The second state is " + state);
		
		//Find in list
		int pos = list.indexOf("Alaska");
		System.out.println("Alaska is at position " + pos);
	}

}
