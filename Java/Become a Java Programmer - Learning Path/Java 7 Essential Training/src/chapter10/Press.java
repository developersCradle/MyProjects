package chapter10;

import java.util.List;
import chapter10.model.Olive;
/*
 * Interface kertoo mit� tulee olemaan, mutta ei miten. V�h�n kuin c++:sta tuttu prototyypitys
 */
public interface Press 
{
	public int getOil(List<Olive> olives);
	public void setOil(int oil);
}

