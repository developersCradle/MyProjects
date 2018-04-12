package chapter9.model;
//Using enums to standardize values
public enum OliveName 
{
	KALAMATA("Kalamata"), LIGURIAN("Lingurian"); //Telling to which literal string this is to be translated
	//KALAMATA, LIGURIAN; //These are identified and printed as BIG LETTERS
	
	private String name;
	
	//Enum constructor can ONLY be private 
	private OliveName(String name) 
	{
		this.name = name;
	}
	
	//When this instance is outputted to console, we want this string to be displayed
	//We can achieve this by overriding .toString() method. Every Java class has .toString()
	@Override
	public String toString()
	{
		
		return name;
	}
}
