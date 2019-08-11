package tutorial_41_abstract_classes;

//COMMON CLASS
//Abstract prevents instantiating this class
//Abstract class can have abstract methods
public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Forces all child classes to implement these methods, but machine itself cannot implement this
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();

	public void run()
	{
		start();
		doStuff();
		shutdown();
	}
}
