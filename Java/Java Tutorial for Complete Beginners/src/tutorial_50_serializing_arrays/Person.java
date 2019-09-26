package tutorial_50_serializing_arrays;

import java.io.Serializable;


/*
 * To make class Serializable to implement Serializable interface 
 */
public class Person implements Serializable {
    
	
	/*
	 * Way of checking, that you are reading exact class which you were writing in first place
	 * if defined, this must match with file what you are reading or writing
	 */
    private static final long serialVersionUID = 4801633306273802062L;
    
    private int id;
    private String name;
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
