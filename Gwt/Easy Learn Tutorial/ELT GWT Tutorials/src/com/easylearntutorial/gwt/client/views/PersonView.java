package com.easylearntutorial.gwt.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.easylearntutorial.gwt.client.presenters.PersonPresenter;;

public class PersonView extends Composite implements PersonPresenter.Display  {

	/*
	 * contain UI logic , not logic
	 */
	private static PersonViewUiBinder uiBinder = GWT.create(PersonViewUiBinder.class);

	private PersonPresenter presenter;
	
	interface PersonViewUiBinder extends UiBinder<Widget, PersonView> {
	}

	public PersonView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;
	@UiField
	Label name;

	public PersonView(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		if (presenter != null) {
			presenter.showFullName();
		}
	}

	@Override
	public void clear() {
		name.setText("");
		
	}

	@Override
	public void setName(String name) {
		this.name.setText(name);
		
	}

	@Override
	public void setPresenter(PersonPresenter presenter) {
		this.presenter = presenter;
		
	}

}
