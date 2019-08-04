package tutorial_29_public_private_protected.world;

public class Plant {
	
	//Bad practice, instance field should be private
	public String name;

	//Acceptable practice ---- it's final.
	public final static int ID = 8;
	
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		
		size = "medium ";
		name = "Freddy";
		type = "Plant";
		height = 8;
	}
	

}
