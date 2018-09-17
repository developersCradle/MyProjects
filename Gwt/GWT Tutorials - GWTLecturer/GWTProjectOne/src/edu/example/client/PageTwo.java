package edu.example.client;




import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class PageTwo extends Composite
{
	
	private HorizontalPanel hPanel = new HorizontalPanel();
	public PageTwo()
	{
		initWidget(this.hPanel);
		
		FlexTable tbl = new FlexTable();
		tbl.setBorderWidth(1);
		
		Label tb1 = new Label("1");
		Label tb2 = new Label("2");
		Label tb3 = new Label("3");
		Label tb4 = new Label("4");
		
		tbl.setWidget(0, 0, tb1);
		tbl.setWidget(0, 1, tb2);
		tbl.setWidget(1, 0, tb3);
		tbl.setWidget(1, 1, tb4);
		
		
		hPanel.add(tbl);
	}
}
