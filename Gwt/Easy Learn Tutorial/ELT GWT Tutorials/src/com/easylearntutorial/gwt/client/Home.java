package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {


	private LitleForm form = new LitleForm();
	@Override
	public void onModuleLoad() { //Like main
		RootPanel.get().add(form);
	}

}
