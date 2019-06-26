package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	Label newLabel = new Label("Hello World");
	@Override
	public void onModuleLoad() { //Like main
		RootPanel.get().add(newLabel);

	}

}
