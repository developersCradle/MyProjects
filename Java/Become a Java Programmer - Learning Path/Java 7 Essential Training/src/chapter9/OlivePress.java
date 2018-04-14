 
package chapter9;

import java.util.List;

import chapter9.model.Olive;
//OlivePress does the proccessing
public class OlivePress
{
	public int getOil(List<Olive> olives)
	{
		int totalOil = 0;
		
		for(Olive o : olives)
		{
			System.out.println(o.getName());
			totalOil += o.crush();
		}
		
		return totalOil;
	}
}
