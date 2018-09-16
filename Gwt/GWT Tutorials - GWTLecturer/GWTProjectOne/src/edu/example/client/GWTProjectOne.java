package edu.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GWTProjectOne implements EntryPoint {
	

	
	
	@Override
	public void onModuleLoad() //like static void main
	{
		VerticalPanel vPanel = new VerticalPanel();
		
		PageOne page = new PageOne();
		
		RootPanel.get().add(page); //adding to HTML page

	}

}
  