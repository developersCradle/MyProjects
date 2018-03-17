package chapter9;

import java.util.ArrayList;
import java.util.List;

import chapter9.model.Olive;
import chapter9.model.OliveName;

public class InstanceVariable {

	public static void main(String[] args) 
	{
		List<Olive> olives = new ArrayList<>();
		Olive olive1 = new Olive(OliveName.KALAMATA, 0x2E0854, 3);
		olives.add(olive1);
		Olive olive2 = new Olive();
		olive2.setOil(1);
		olives.add(olive2);
		Olive olive3 = new Olive();
		olive3.setOil(4);
		olives.add(olive3);
		
		OlivePress press = new OlivePress();
		int totalOil = press.getOil(olives);
		System.out.println("Total olive oil: " + totalOil);

	}

}
