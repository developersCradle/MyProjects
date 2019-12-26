package tutorial_59_sorting_lists;
//14:12
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int id;
	private String name;
	
	public Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return id + " " +name;
	}
}
//If you wana sort in another way than natural order
class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		//s1 == s2 return 0
		//first arguments should sort later in the list. s1 > s2  return 1 
		//first arguments should sort earlier in the list. s1 < s2  return -1

		int len1 = s1.length();
		int len2 = s2.length();
		
		
		if (len1 > len2) {
			return 1;
		}
		else if(len1 < len2)
		{
			return -1;
		}
		return 0;
	}
	
}

class ReverseAlphabeticalComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		//+1 if s1 > s2
		//-1 if s1 < s2
		//To reverse, we just add negative sign
		return -s1.compareTo(s2); // Defines natural order 
	}
	
}


public class App {

	public static void main(String[] args) {

		////////////////////// Sorting with Strings /////////////////////
		
		List<String> animals = new ArrayList<String>();
		
		
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");
		
		
		/////////////////////////SORTING ALPHABETICALLY////////////////////////////
		/////////////////////NATURAL ORDER SORTING/////////////////////
		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		

		
		for(String animal : animals)
		{
			System.out.println(animal);
		}
		
		
		
		/////////////////////// Sorts Numerical order/////////////////////
		// /////////////////////NATURAL ORDER SORTING/////////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		
//		Collections.sort(numbers);
		Collections.sort(numbers, new Comparator<Integer>() { // we could do this trough anonymous class

			@Override
			public int compare(Integer num1, Integer num2) {

				return -num1.compareTo(num2);
			}
		});
		
		
		
		for(Integer number : numbers)
		{
			System.out.println(number);
		}
		
		
		
		//////////////////////// Sorting arbitrary objects ////////////////////'
		
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Clare"));
		people.add(new Person(4, "Sue"));
		people.add(new Person(2, "Bob"));
		
		
		//Sort in order of name
		//Does not have natural order
		//Collection.sort(people); This does not work
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
		
				
				
				if (p1.getId() > p2.getId()) {
					return 1;
				}
				else if(p1.getId() < p2.getId())
				{
					return -1;
				}
				return 0;
				
					
				
			}
			
		}); 
		
		for (Person person : people) {
			System.out.println(person);
		}
		
		
		System.out.println("\n");
		//Alphabetical order
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
		
	
				
				return p1.getName().compareTo(p2.getName());
					
				
			}
			
		}); 
		
		for (Person person : people) {
			System.out.println(person);
		}
		
		
		
		}
	
	
	
	}
	 

