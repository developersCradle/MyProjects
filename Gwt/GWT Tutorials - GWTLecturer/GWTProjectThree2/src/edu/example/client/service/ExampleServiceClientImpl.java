package edu.example.client.service;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

import edu.example.client.gui.MainGUI;
import edu.example.client.service.model.ImageList;
import edu.example.client.service.model.PersonalInfo;

public class ExampleServiceClientImpl implements ExampleServiceClientInt {

	private ExampleServiceAsync service;
	private MainGUI maingui;

	//Facility for RPC calls
	public ExampleServiceClientImpl(String url) {
		System.out.println(url);
		this.service = GWT.create(ExampleService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
		endpoint.setServiceEntryPoint(url);

		this.maingui = new MainGUI(this);
	}

	@Override
	public void sayHello(String name) {
		this.service.sayHello(name, new DefaultCallback());

	}

	@Override
	public void addTwoNumber(int num1, int num2) {
		this.service.addTwoNumber(num1, num2, new DefaultCallback());

	}

	@Override
	public void getPersonalInfo(String familyName) {
		this.service.getPersonalInfo(familyName, new DefaultCallback());

	}

	@Override
	public void getImages() {

		this.service.getImages(new DefaultCallback());
	}

	public MainGUI getMainGUI() {
		return this.maingui;
	}

	private class DefaultCallback implements AsyncCallback {

		@Override
		public void onFailure(Throwable caught) {
			System.out.println("An Erro has occured");

		}

		@Override
		public void onSuccess(Object result) {
			if (result instanceof String) {
				String greetings = (String) result;
				maingui.updateLabel(greetings);
			} else if (result instanceof Integer) {
				int sum = (Integer) result;
				maingui.updateSumLabel(sum);

			} else if (result instanceof PersonalInfo) {
				PersonalInfo info = (PersonalInfo) result;
				maingui.displayPersonalInfo(info);

			} else if (result instanceof ImageList) {
				ImageList list = (ImageList) result;
				maingui.displayImages(list);

			}

		}
	}
}
