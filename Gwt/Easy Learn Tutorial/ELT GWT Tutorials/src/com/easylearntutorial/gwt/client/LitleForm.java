package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class LitleForm extends Composite {

	private static LitleFormUiBinder uiBinder = GWT.create(LitleFormUiBinder.class);

	interface LitleFormUiBinder extends UiBinder<Widget, LitleForm> {
	}

	public LitleForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setText(String text)
	{
		
	}

}
