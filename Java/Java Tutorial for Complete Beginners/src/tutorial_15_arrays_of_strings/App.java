package tutorial_15_arrays_of_strings;

public class App {

	public static void main(String[] args) {

		// Declare array of (references to) strings.
		String[] words = new String[3];

		// Set the array elements (point the references
		// at strings)
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";

		// Access an array element and print it.
		System.out.println(words[2]);

		// Simultaneously declare and initialize an array of strings
		String[] fruits = { "apple", "banana", "pear", "kiwi" };

		// Iterate through an array
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// "Default" value for an integer
		int value = 0;

		// Default value for a reference is "null"
		//Class starts with big letter
		//Since String is not primitive type, its is reference type
		//text String reference holds enought memory to point Sring
		String text = null;

		System.out.println(text);

		// Declare an array of strings
		String[] texts = new String[2];

		// The references to strings in the array
		// are initialized to null.
		System.out.println(texts[0]);

		// ... But of course we can set them to actual strings.
		texts[0] = "one";
	}

}