package tutorial_25_the_toString_method;

class Frog{
	private int id; 
	private String name;
	public String toString() {
		
		return String.format("%4d: %s", id, name);
		
		/* Other way doing this
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		//Everytime you put + in string, you are concatenating new string
		//"ds" + "dsd" contains two strings
		return sb.toString();
		*/
	} 
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}


public class App {

	/*
	 * All object have Object as ultimately as parent
	 */
	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "Freddy");
		Frog frog2 = new Frog(5, "Rogers");
		frog1.toString(); //These methods are from Object super class
		//toString is very Helpful in debugging your application
		
		
		System.out.println(frog1);
		System.out.println(frog2);
		/*
		 * When you SysOut to object it will call Objects toString() method
		 */
		/*
		 * If you forgot Override toString(). Your object will print something like this
		 * tutorial_25_the_toString_method.Frog@15db9742
		 * @15db9742 is Hash code UID for Java objects
		 * 
		 */
	}

}
