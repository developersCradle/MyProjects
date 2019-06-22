package tutorial54;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * EVENT is what user can do
 * EVENT HANDLER is how your code answers to user
 * this overall process is called EVENT HANDLING
 *  
 *  LISTENER waits for user to input
 */

public class Tuna extends JFrame {
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public Tuna() {
		super("This is title");
		setLayout(new FlowLayout());
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text here");
		add(item2);
		
		item3  = new JTextField("Uneditble", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("Mypass");
		add(passwordField);
		
		thehandler handler = new thehandler(); //ACTION LISTENER object
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	//Class inside class, inside class inherits form mother class
	private class thehandler implements ActionListener //Our own event handler
	{
		//when EVENT happens call this method
		public void actionPerformed(ActionEvent event)
		{
			String string = "";
			//getSource() is where it happened
			if (event.getSource() == item1) {
				string = String.format("field 1: %s", event.getActionCommand());
				
			}
			else if  (event.getSource() == item2) {
				string = String.format("field 2: %s", event.getActionCommand());
				
			}
			else if  (event.getSource() == item3) {
				string = String.format("field 3: %s", event.getActionCommand());
				
			}
			else if  (event.getSource() == passwordField){
				string = String.format("field passworField: %s", event.getActionCommand());
				
			}
			
			JOptionPane.showMessageDialog(null, string);
			
		}
	}

}
