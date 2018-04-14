package chapter10.model;
 // Olive contains data
public  abstract class Olive
{

    private OliveName name;
    private OliveColor color;
    private int oil;

    public Olive(OliveName name, OliveColor color, int oil) 
    {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName()
    {
        return name;
    }

    public void setName(OliveName name)
    {
        this.name = name;
    }

    public OliveColor getColor() 
    {
        return color;
    }

    public void setColor(OliveColor color) 
    {
        this.color = color;
    }

    public int crush()
    {
    	//Using power of abstract
    	String msg = name + ", from " + getOrigin() + ": " + oil + " units";
        System.out.println(msg);
        return oil;
    }

    public void setOil(int oil) 
    {
        this.oil = oil;
    }

    
    public abstract String getOrigin(); //Abstract method, every subclass need to implement getOrigin()
    
    @Override
    public String toString() 
    {
        return name.toString();
    }

}
