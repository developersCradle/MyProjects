package tutorial_31_capsulation_and__the_API_docs;

class Plant
{
	public static final int ID = 7;//NORMALLY PUBLIC what you wants out of your class
	
	private String name;
	/*
	 * Use 
	 * 1.Private if not
	 * 2. Protected
	 * 3. Last resold public
	 */
	
	public String getData()
	{
		String  data = "Some stuff" + calculateGrowthForecast();
		return data;
	}
	
	public int calculateGrowthForecast()
	{
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class App {

}
