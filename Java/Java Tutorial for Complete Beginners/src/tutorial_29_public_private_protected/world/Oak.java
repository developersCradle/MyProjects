package tutorial_29_public_private_protected.world;

public class Oak extends Plant{

	public Oak() {
		//Won't work ---- type is private
//		type = "tree";
		
		
		// Works since size is protected, Oak is subclass of plant
		size = "large";
		
		//NO access specifier, we are same in package
		height = 10;
		
	}
}
