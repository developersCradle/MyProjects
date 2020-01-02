package com.caveofprogramming.designpatterns.demo1.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.caveofprogramming.designpatterns.demo1.model.Model;

public class View extends JFrame implements ActionListener {
	
	private Model model;
	private JButton helloButton;
	private JButton goodbyeButton;

	public View(Model model) {
		super("MVC Demo");
		
		this.model = model;
		
		helloButton = new JButton("Hello!");
		goodbyeButton = new JButton("Goodbye!");
		
		
		//SWING STUFF DONT WORRY
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridx=1;
		gc.gridy=1;
		gc.weightx=1;
		gc.weighty=1;
		gc.fill=GridBagConstraints.NONE;
		
		add(helloButton, gc);
		
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridx=1;
		gc.gridy=2;
		gc.weightx=1;
		gc.weighty=1;
		gc.fill=GridBagConstraints.NONE;
		
		add(goodbyeButton, gc);
		//SWING STUFF DONT WORRY^
		
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		/*
		 * Set implies there is only one
		 * Add implies there is list of listeners
		 * 	- Notifies all listeners when Event is occurred
		 */
		
		
		goodbyeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					System.out.println("Sorry to see you go.");
	
			}
			
		});
	
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Event object is part of observer pattern
		JButton source = (JButton)e.getSource();
		
		if(source == helloButton) {
			System.out.println("Hello there!");
		}
		else {
			System.out.println("Some other button.");
		}
		
	}
	
	

}
