package tutorial_43_try_with_resources;



/*
 * AutoCloseable just spesifes that your class should have close method
 */
class Temp implements AutoCloseable
{

	@Override
	public void close() throws Exception {

		System.out.println("Closing!");
		
		throw new Exception("Oh no!");
	}
	
}

public class App {
	

	public static void main(String[] args) {
		
			//Thill automatically call close()	
			try(Temp temp = new Temp()) //Try with resources
			{
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	
		}
		
	}
	

