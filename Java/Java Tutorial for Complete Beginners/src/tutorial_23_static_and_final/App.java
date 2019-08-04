package tutorial_23_static_and_final;

class Thing {
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	
	public int id;
	
	public static int count = 0;
	 
	public Thing() {
		id = count; //Keeps track object own ID
		count++;
	}
	
	public void showName()
	{
		System.out.println("Object id: " + id + ", " + description + ": " + name); //Instance methods can access static data
	}
	
	public static void showInfo()
	{
		System.out.println(description);
//		System.out.println(name); Static method cannot refer to instance stuff
	}
}


 
public class App {
    public static void main(String[] args) {
    	
    	Thing.description = "I am the thing";
    	
    	Thing.showInfo();
    	
    	System.out.println("Before creating objects, count is: " + Thing.count);
    	
    	System.out.println(Thing.description);

    	Thing thing1 = new Thing();
    	Thing thing2 = new Thing();
    	
    	System.out.println("After creating objects, count is: " + Thing.count);
    	
    	thing1.name = "Bob";
    	thing2.name ="Sue";
    	
    	System.out.println(thing1.name);
    	System.out.println(thing2.name);
    	
    	thing1.showName();
    	thing2.showName();
    	
    	System.out.println(Math.PI);
    	//Math.PI = 3; Constants cannot be changed, constants are written in uppercase letters
    	System.out.println(Thing.LUCKY_NUMBER);
    }
 
}