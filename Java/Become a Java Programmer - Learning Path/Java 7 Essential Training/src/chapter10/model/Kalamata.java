package chapter10.model;


//Subclass expects to have no arguments constructor in subclass
public class Kalamata extends Olive //Make this sub class of Olive
{
	public Kalamata() 
	{ 
		//calling  Olive Constructor
		super(OliveName.KALAMATA, OliveColor.PURPLE, 2);
	}

	@Override
	public String getOrigin() 
	{
		return "Greece";
	}
}
