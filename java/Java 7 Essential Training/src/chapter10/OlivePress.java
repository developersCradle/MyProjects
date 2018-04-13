package chapter10;

import chapter10.model.Olive;

import java.util.List;

/*
 * In Java word Abstract 
 */
public class OlivePress implements Press
{
	private int curerentOil;
	
	public int getOil(List<Olive> olives)
	{
		
		
		int totalOil = curerentOil;
		for (Olive o : olives) 
		{
			totalOil += o.crush();
		}

		return totalOil;

	}

	@Override
	public void setOil(int oil) 
	{
		curerentOil = oil;
		
	}

}
