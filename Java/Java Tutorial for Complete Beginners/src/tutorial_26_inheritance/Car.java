package tutorial_26_inheritance;


/*
 * Final classes cannot be extended
 */
public class Car extends Machine {
	
	
	
	@Override //Annotation, helps to make sure that we are overriding method
	public void start() {
		System.out.println("Car started");
		//super.start(); Car would still have start(), but this line would call parents start()
	}

	public void wipeWindShield()
	{
		System.out.println("Wiping windshield");
	}
	
	public void showInfo()
	{
		System.out.println("Car name: " + name);
	}
	
	
}
