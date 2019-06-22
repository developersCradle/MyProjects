package tutorial52;

import java.awt.*;
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
	}
	

	

}
