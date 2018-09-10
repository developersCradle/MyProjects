package edu.example.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.example.client.service.model.ImageList;
import edu.example.client.service.model.PersonalInfo;

@RemoteServiceRelativePath("exampleservice") //Shortcut name

public interface ExampleService extends RemoteService {
	String sayHello(String name);

	int addTwoNumber(int num1, int num2);

	PersonalInfo getPersonalInfo(String familyName);

	ImageList getImages();

}
