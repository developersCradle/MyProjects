package tutorial_33_upcasting_and_downcasting;
/*
 * You cannot cast Objects to other Objects, but you can change the references
 */
class Machine
{
	public void start()
	{
		System.out.println("Machine started.");
	}
}

class Camera extends Machine
{
	public void start()
	{
		System.out.println("Camera started.");
	}
	
	public void snap()
	{
		System.out.println("Photo taken.");
	}
	
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// UPCASTING, since we casting UP in class hierarchy
		Machine machine2 = camera1;
		machine2.start();
		//machine2.snap(); Not working, actual variable decides what you can call
		
		
		//DOWNCASTING
		Machine machine3 = new Camera();
		/*
		 * When downcasting Java wants confirmation that you are downcasting
		 * - Downcasting is unsafe -> Java wants make sure
		 */
		Camera camera2 = (Camera)machine3;
		camera2.snap();
		
		//This doesn't work ---- runtime error
		Machine machine4 = new Machine();
//		Camera camera3 = (Camera)machine4;
//		camera3.start();
//		camera3.snap();
	}

}
