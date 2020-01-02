package com.caveofprogramming.designpatterns.demo1.view;
/*
 * Bean class //Stores data in standard way
 * - Something stores data
 * - Has getter and setter for that data
 */
public class LoginFormEvent {
	private String name;
	private String passoword;

	public LoginFormEvent(String name, String passowrd) {
		this.name = name;
		this.passoword = passowrd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassoword() {
		return passoword;
	}

	public void setPassoword(String passowrd) {
		this.passoword = passowrd;
	}

	
	
	
}
