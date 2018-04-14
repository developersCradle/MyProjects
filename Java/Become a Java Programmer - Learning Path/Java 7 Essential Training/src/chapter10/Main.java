package chapter10;

import chapter10.model.Kalamata;
import chapter10.model.Ligurian;
import chapter10.model.Olive;
import chapter10.model.OliveColor;
import chapter10.model.OliveName;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) 
    {
    	//Declaring object which is instance of interface = Concrete implementation of that list The ArrayList
        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        
        //It is a instance of press interface
        Press press = new OlivePress();//We trust OliverPress class to implement needs of interface -> providing code for setOuil() and getOil()
        press.setOil(5); //we calling setOil from press interface(interface does not know about  setOil())
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");
       
        /*
        Press press2 = new Press()  // We can also instantiate interfaces directly, if we do that we NEED implement CODE OURSELF
        {
			
			@Override
			public void setOil(int oil)
			{

				
			}
			
			@Override
			public int getOil(List<Olive> olives) 
			{

				return 0;
			}
		};
		*/
		/*
		 * This type of type of code is very common in android platform
		 * Interfaces are used in android for event handling, callback methods .. etc
		 */

    }

}
