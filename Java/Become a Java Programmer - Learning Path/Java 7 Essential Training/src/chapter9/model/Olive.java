package chapter9.model;

//Model class defines data model

//Olive contains data
public class Olive 
{
	//public static final String KALAMATA = "Kalamata"; Constants in java
	//public static final String LINGURIAN = "Lingurian"; Constants in java
	
	private OliveName name = OliveName.KALAMATA; //Fields of the class
	private long color = 0x2E0854;
	private int oil = 3;
	
	public Olive() // No arguments constructor created by explicit
	{
		
	}
	
	public Olive(OliveName name, long color, int oil)
	{
		this.name = name;
		this.color = color;
		this.oil = oil;
	}
	
	
	//To Generate getter/setters = Source -> Generate getter and Setters
	public OliveName getName() 
	{
		return name;
	}
	public void setName(OliveName name) 
	{
		this.name = name; //This is used for making differentiation between Field and Argument
	}
	public long getColor()
	{
		return color;
	}
	public void setColor(long color)
	{
		this.color = color;
	}
	public int crush() 
	{
		System.out.println("Ouch!");
		return oil;
	}
	public void setOil(int oil) 
	{
		this.oil = oil;
	}
	
	
}
