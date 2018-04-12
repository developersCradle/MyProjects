package chapter9.ClassRelationships;



import java.util.Scanner;

public class Calculator extends InputHelper 
{
	/*
	 * No explicit constructor -> Java compiler creates  no argument constructor
	 */

    public static void main(String[] args) 
    {
   
    	
    	Calculator calculator = new Calculator();
    	calculator.calculate();
    	
    	calculator.calculate();// Refactor -> Excract method
    }

	protected void calculate() 
	{ 
		InputHelper helper = new InputHelper(); //Android SDK uses a lot a nested classes
		
		String s1 = helper.getInput("Enter a numeric value: ");
        String s2 = helper.getInput("Enter a numeric value: ");
        String op = helper.getInput("Choose an operation (+ - * /):");

        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.subtractValues(s1, s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
	}
    
	
	
}