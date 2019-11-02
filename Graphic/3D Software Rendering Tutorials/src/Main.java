
public class Main {

	public static void main(String[] args) {

		Display display = new Display(800, 600, "First steps to Software Rendering");
		
		Bitmap target = display.GetFrameBuffer(); //To render to
		Stars3D stars = new Stars3D(4096, 64.0f, 20.0f);
		long previousTime = System.nanoTime();
		
		while (true) {

			long currentTime = System.nanoTime();
			float delta = (float)((currentTime - previousTime)/1000000000.0);
			
			/*
			 * There is billion nanoseconds in second
			 */
			
			previousTime = System.nanoTime();

			
			stars.UpdateAndRender(target, delta);
			display.swapBuffers();
		}
	}

}
