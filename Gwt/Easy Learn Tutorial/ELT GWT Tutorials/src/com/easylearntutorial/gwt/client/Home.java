package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class Home implements EntryPoint {

	//private Button btn;
	//private Button btn2;
//06:00
	//private LitleForm form = new LitleForm();
	@Override
	public void onModuleLoad() { //Like main
		MenuBar menu = new MenuBar(false);
		Command cmd = new Command() {
			@Override
			public void execute() {

				Window.alert("CLICKED");
			}
		};
		MenuBar menuFile = new MenuBar(true /*Vertical*/);
		menuFile.addItem(new MenuItem("New", cmd));
		menuFile.addItem(new MenuItem("Open File", cmd));
		menuFile.addItem(new MenuItem("Close", cmd));
		
		menu.addItem(new MenuItem("File", menuFile));
		menu.addItem(new MenuItem("Edit", cmd));
		menu.addItem(new MenuItem("Refactor", cmd));
		
		RootPanel.get().add(menu);
		//RootPanel.get().add(form); //UIBinder form
//		btn = new Button("click me");
//		btn2 = new Button(":(");
//		btn.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//				btn2.setText("=)");
//			}
//		});
//				
//		RootPanel.get("someID").add(btn);
//		RootPanel.get().add(btn2);
	}

}
