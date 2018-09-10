package edu.example.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.example.client.service.ExampleServiceClientImpl;
import edu.example.client.service.model.ImageList;
import edu.example.client.service.model.PersonalInfo;

public class MainGUI extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox txt1;
	private Label resultLbl;
	private ExampleServiceClientImpl serviceImpl;

	private TextBox familyNameTxt;
	private TextBox txtNum1;
	private TextBox txtNum2;
	private Label sumLbl;

	public MainGUI(ExampleServiceClientImpl serviceImpl) {
		initWidget(this.vPanel);
		this.serviceImpl = serviceImpl;

		this.txt1 = new TextBox();
		this.vPanel.add(txt1);

		Button btn1 = new Button("Say Hello");
		btn1.addClickHandler(new Btn1ClickHandler());
		this.vPanel.add(btn1);

		this.resultLbl = new Label("Result will be here");
		this.vPanel.add(resultLbl);

		this.txtNum1 = new TextBox();
		this.vPanel.add(txtNum1);

		this.txtNum2 = new TextBox();
		this.vPanel.add(txtNum2);

		Button btn2 = new Button("Add two numbers");
		btn2.addClickHandler(new Btn2ClickHandler());
		this.vPanel.add(btn2);

		this.sumLbl = new Label("Sum will be here");
		this.vPanel.add(sumLbl);

		this.familyNameTxt = new TextBox();
		this.vPanel.add(familyNameTxt);

		Button bioDataBtn = new Button("Get BioData");
		bioDataBtn.addClickHandler(new BioDataClickHandler());
		this.vPanel.add(bioDataBtn);

		Button imagesBtn = new Button("Get Images");
		imagesBtn.addClickHandler(new ImagesClickHandler());
		this.vPanel.add(imagesBtn);

	}

	public void displayPersonalInfo(PersonalInfo info) {
		HTML html = new HTML(); //HTML structure 

		String code = "<b>Name:</b> " + info.getName() + "</br>";
		code = code + "<b>Age:</b>" + info.getAge() + "</br>";
		code = code + "<b>Gender:</b>" + info.getGender() + "</br>";

		html.setHTML(code);
		this.vPanel.add(html);

	}

	public void displayImages(ImageList images) {
		String[] imageList = images.getImages();

		for (int i = 0; i < imageList.length; i++) {
			Image aImage = new Image(imageList[i]);
			aImage.setWidth("600px");
			this.vPanel.add(aImage);
		}
	}

	public void updateLabel(String greeting) {
		this.resultLbl.setText(greeting);
	}

	public void updateSumLabel(int sum) {
		this.sumLbl.setText("" + sum);
	}

	private class BioDataClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			String familyName = familyNameTxt.getText();
			serviceImpl.getPersonalInfo(familyName);

		}
	}

	private class ImagesClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			serviceImpl.getImages();

		}
	}

	private class Btn1ClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			String name = txt1.getText();
			serviceImpl.sayHello(name);

		}
	}

	private class Btn2ClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			int num1 = Integer.valueOf(txtNum1.getText());
			int num2 = Integer.valueOf(txtNum2.getText());

			serviceImpl.addTwoNumber(num1, num2);

		}
	}

}
