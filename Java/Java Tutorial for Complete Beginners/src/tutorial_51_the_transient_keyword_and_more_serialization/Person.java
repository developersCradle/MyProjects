package tutorial_51_the_transient_keyword_and_more_serialization;

import java.io.Serializable;


/*
 * We don't want Serialize fields what we are not using, inefficient
 */

public class Person implements Serializable {
	
	private static final long serialVersionUID = 4139365352765540282L;
	
	
	//transient prevents from being Serialized
    private transient int id;
    private String name;
    
    private static int count;
    /*
     * Static fields are not serialized
     */
    
    
    
    public Person()
    {
    	System.out.println("Default cosntructor");
    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        
        System.out.println("Two-argument constructor");
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
    }

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
}
