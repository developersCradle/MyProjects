package chapter9.model;

public enum OliveName 
{
	KALAMATA("Kalamata"), LIGURIAN("Ligurian");
	
	private String name;
	
	private OliveName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString() { // We override original toString()
		// TODO Auto-generated method stub
		return name;
	}
	
}
