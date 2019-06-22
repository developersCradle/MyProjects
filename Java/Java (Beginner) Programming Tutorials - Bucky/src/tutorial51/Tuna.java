package tutorial51;

import java.awt.FlowLayout;//FlowLayout to right+to right+to right
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tuna extends JFrame{
	
	private JLabel item1;

	public Tuna() {
		super("The title bar!");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is sentance");
		item1.setToolTipText("This is gonna show in hover");
		add(item1);
	}
	

}
