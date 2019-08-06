package tutorial_35_generics_and_wildcards;

import java.util.ArrayList;
import java.util.Iterator;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start()
	{
		System.out.println("Machine starting");
	}

}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public void snap()
	{
		System.out.println("Snap!");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());
		list1.add(new Machine());
		
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());
		showList(list2);

	}
// ? wildcard, mean unknown type in this case
//  you must work with Object type. Cannot anymore call any class specific stuff
	public static void showList(ArrayList<? extends Machine> List) {
		for (Machine value : List) {
			System.out.println(value);
			value.start();
			
		}
		
		
	}

}
