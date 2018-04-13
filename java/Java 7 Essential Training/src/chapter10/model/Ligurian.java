package chapter10.model;
/*
 * To easily copy class with refactoring, use copy and paste.
 * 
 */

//Subclass expects to have no arguments constructor in subclass
public class Ligurian extends Olive //Make this sub class of Olive
{
	//Kun Luodaan Ligurian() luokka, ohjelma kutsuu Olive luokan rakentajaa Ligurian ominaisilla arvoilla
	public Ligurian() 
	{ 
		//calling  Olive Constructor
		super(OliveName.LIGURIAN, OliveColor.BLACK, 5);
	}

	@Override
	public String getOrigin() 
	{
		
		return "Italy";
	}
}
