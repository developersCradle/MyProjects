package tutorial_29_public_private_protected;

import tutorial_29_public_private_protected.world.Plant;


/*
 * private --- only within same class
 * public --- from anywhere
 * protected -- same class, subclass, and same package
 * no modifier -- same package only
 */
 
public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		System.out.println(plant.ID);
		
		//Won't work ---- type is private
//		System.out.println(plant.type);
		
		
		//size is protected; App is not in the same package as Plant
//		System.out.println(plant.size); //WONT WORK

		
        // Won't work; App and Plant in different packages, height has package-level visibility.
//		System.out.println(plant.height);
		
	}

}
