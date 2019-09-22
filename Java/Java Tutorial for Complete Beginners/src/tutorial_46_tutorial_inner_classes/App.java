package tutorial_46_tutorial_inner_classes;

public class App {
	
	public static void main(String[] args) {
		
		
		/*
		 * When you create instance of class you don't create instance of inner classes
		 	- You need to do this explicitly
		 */
		Robot robot = new Robot(7);
		robot.start();
		
		//One weird case for using inner class
//		Robot.Brain brain = robot.new Brain();
//		brain.think();
	
	
		Robot.Battery battery = new Robot.Battery();//this is common way in Java to use inner static classes
		battery.charge();
	}
}