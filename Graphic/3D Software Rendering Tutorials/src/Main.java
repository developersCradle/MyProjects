
public class Main {

	public static void main(String[] args) {

		Display display = new Display(800, 600, "First steps to Software Rendering");
		//		System.out.println("Hello World");
		
		
		while (true) {
			display.swapBuffers();
		}
	}

}
