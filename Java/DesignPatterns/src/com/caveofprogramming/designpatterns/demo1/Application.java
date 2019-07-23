package com.caveofprogramming.designpatterns.demo1;

import javax.swing.SwingUtilities;

import com.caveofprogramming.designpatterns.demo1.controller.Controller;
import com.caveofprogramming.designpatterns.demo1.model.Model;
import com.caveofprogramming.designpatterns.demo1.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				runApp();
			}
		});
	}
	
	
	public static void runApp()
	{
		Model model = new Model();
		View view = new View(model);//We pass model to view
		
	
		Controller controller = new Controller(view, model);//we need to pass references to Controller so we can issue commands for them
	}

}
