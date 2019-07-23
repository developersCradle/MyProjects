package tutorial_28_interfaces;


/*
 * Implements forces you to write what ever is specified in Info
 */

public class Machine implements Info{
	
	private int id = 7;
	
	public void start()
	{
		System.out.println("Machine started!");
	}

	public void showInfo() {
		System.out.println("Machine ID is: " + id);
	}

}
