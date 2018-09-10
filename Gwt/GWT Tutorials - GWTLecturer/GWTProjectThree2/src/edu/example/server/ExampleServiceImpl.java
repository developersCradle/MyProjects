package edu.example.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.example.client.service.ExampleService;
import edu.example.client.service.model.ImageList;
import edu.example.client.service.model.PersonalInfo;

public class ExampleServiceImpl extends RemoteServiceServlet implements ExampleService {

	@Override
	public String sayHello(String name) {
		String greeting = "Hello " + name;
		return greeting;
	}

	@Override
	public int addTwoNumber(int num1, int num2) {
		int y = num1 + num2;
		return y;
	}

	@Override
	public PersonalInfo getPersonalInfo(String familyName) {
		PersonalInfo bioData = new PersonalInfo();
		bioData.setName("Teppo Sulkava");
		bioData.setAge(32);
		bioData.setGender("Male");
		return bioData;
	}

	@Override
	public ImageList getImages() {
		ImageList imageList = new ImageList();

		String[] images = new String[2];
		images[0] = "images/image1.jpg";
		images[1] = "images/image2.jpg";

		imageList.setImages(images);

		return imageList;
	}

}
