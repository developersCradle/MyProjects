package com.caveofprogramming.designpatterns.demo1.view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import com.caveofprogramming.designpatterns.demo1.model.Model;

public class View extends JFrame{
	private Model model;//we keep reference to Model

	public View(Model model) throws HeadlessException {
		super("MVC Demo"); //JFrame related
		this.model = model;
	}


	
}
