package chapter9.model;
// No arhument constructor is working
public class Olive 
{
	
	public Olive() {}
	
	public Olive(OliveName name, long color, int oil)
	{
		this.name = name;
		this.oil = oil;
		this.color = color;
	}
	
	public OliveName getName() {
		return name;
	}
	public void setName(OliveName name) {
		this.name = name;
	}
	public long getColor() {
		return color;
	}
	public void setColor(long color) {
		this.color = color;
	}
	public int crush() 
	{
		System.out.println("Ouch!");
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	private OliveName name = OliveName.KALAMATA;
	private long color = 0x2E0854;
	private int oil = 3;
}