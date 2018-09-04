package edu.example.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.example.client.service.ExampleServiceClientImpl;

public class MainGUI extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox txt1;
	private Label resultLbl;
	private ExampleServiceClientImpl serviceImpl;

	public MainGUI(ExampleServiceClientImpl serviceImpl) {
		initWidget(this.vPanel);
		this.serviceImpl = serviceImpl;

		this.txt1 = new TextBox();
		this.vPanel.add(txt1);

		Button btn1 = new Button("Say Hello");
		btn1.addClickHandler(new Btn1ClickHandler());
		this.vPanel.add(btn1);

		this.resultLbl = new Label("Result will be here");
	}

	public updateLabel(String greeting)
	{
		this.resultLbl.setText(greeting);
	}

	private class Btn1ClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			String name = txt1.getText();
			serviceImpl.sayHello(name);

		}

	}

}
