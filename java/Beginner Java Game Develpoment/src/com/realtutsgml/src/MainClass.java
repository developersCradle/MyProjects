package com.realtutsgml.src;

import javax.swing.JFrame;

//Finished chapters: 1,2,3,4,6,7,8,9,10,11,12

public class MainClass 
{
	public static final int WIDTH = 640, HEIGHT = 480;
	public static final String TITLE = "Tutorial RealTutsGML";
	public static void main(String[] args) //Java will look for main
	{
		JFrame frame = new JFrame(TITLE);
	    frame.pack();//packs the frame
		frame.setSize(WIDTH,HEIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //null means center on the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Sets operation when user press "x" to close window
		frame.add(new Game());
		frame.setVisible(true); //Makes Window visible
	}

}
