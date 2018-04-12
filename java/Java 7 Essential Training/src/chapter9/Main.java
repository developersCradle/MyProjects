package chapter9; 

import java.util.ArrayList;
import java.util.List;

import chapter9.model.Olive;
import chapter9.model.OliveName;
//Main class is creating the data
public class Main 
{

	public static void main(String[] args) 
	{
		List<Olive> olives = new ArrayList<>();
		//Olive olive1 = new Olive(); //No arguments constructor is being created if there is no constructors 
		olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
		olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
		olives.add(new Olive(OliveName.KALAMATA, 0x000000, 2));
		
		olives.add(new Olive(OliveName.LIGURIAN, 0x2E0854, 3));
		olives.add(new Olive(OliveName.LIGURIAN, 0x2E0854, 3));
		olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));		
		
		OlivePress press = new OlivePress();
		int totalOil = press.getOil(olives);
		System.out.println("Total olive oil: " + totalOil);
		
		
		
	}

}
