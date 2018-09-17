package edu.example.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PageOne extends Composite
{
	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox text1;
	private Label myLbl;
	
	
	public PageOne()
	{
		initWidget(this.vPanel);
		
		vPanel.setBorderWidth(1);

		Image img = new Image("src/images/Banana.gif");
		vPanel.add(img);

		this.myLbl = new Label("Hello World");
		vPanel.add(myLbl);

		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.setBorderWidth(1);

		this.text1 = new TextBox();
		hPanel.add(text1);
		
		Button btn1 = new Button("Touch me please!");
		btn1.addClickHandler(new ButtonClickHandler());
		hPanel.add(btn1);
		
		vPanel.add(hPanel);
		
		PageTwo two = new PageTwo();
		vPanel.add(two);
	}
	
	private class ButtonClickHandler implements ClickHandler
	{

		@Override
		public void onClick(ClickEvent event)
		{
			String theText = text1.getText();
			myLbl.setText(theText);
		
			
		}
		
	}
		
}
