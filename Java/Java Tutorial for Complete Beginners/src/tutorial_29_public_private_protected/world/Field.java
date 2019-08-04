package tutorial_29_public_private_protected.world;

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		// size is protected; Field is in the same package as Plant.
		System.out.println(plant.size);
	}

}
