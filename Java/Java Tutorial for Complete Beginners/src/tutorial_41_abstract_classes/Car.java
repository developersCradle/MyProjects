package tutorial_41_abstract_classes;

public class Car extends Machine{

	@Override
	public void start() {
		System.out.println("Staring car");
		
	}

	@Override
	public void doStuff() {

		System.out.println("doing stuff in car");
	}

	@Override
	public void shutdown() {

		System.out.println("Shutting down car"); 
	}

}
