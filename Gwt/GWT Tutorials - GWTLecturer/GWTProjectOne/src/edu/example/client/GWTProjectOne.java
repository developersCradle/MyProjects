package edu.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GWTProjectOne implements EntryPoint {
	public void onModuleLoad() //like static void main
	{
		VerticalPanel vPanel = new VerticalPanel();

		Image img = new Image("/images/eclipse.jpg");
		vPanel.add(img);

		Label myLbl = new Label("Hello World");
		vPanel.add(myLbl);

		Button btn1 = new Button("Touch me please!");
		vPanel.add(btn1);

		RootPanel.get().add(vPanel); //adding to HTML page

	}
}
