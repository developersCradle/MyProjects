package com.realtutsgml.src;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

import com.realtutsgml.src.input.Controller;
import com.realtutsgml.src.input.KeyInput;
import com.realtutsgml.src.objects.Enemy;
import com.realtutsgml.src.objects.Player;

/*
 * Sound from Free Sound Effects Archive
 * http://www.grsites.com/archive/sounds/
 */

public class Game extends JPanel implements ActionListener //Extends bad practice here?(Come back when more experienced)
{
	private static final long serialVersionUID = 1L; // ID of our class
	private String background = "/images/background.png";
	
	
	Timer gamelooptimer;
	
	Controller c;
	Player p;
	
	public Game() // Constructor
	{
		System.out.println("Game created!");
		setFocusable(true); //Window  get focused when created
		gamelooptimer = new Timer(10, this); //Run actionPerformed() every 10ms
		gamelooptimer.start(); // Start the timer
		
		p = new Player(50,50);
		c = new Controller();
		
	
		addKeyListener(new KeyInput(p));
	}
	
	public void paint(Graphics g)
	{
		super.paint(g); //Calls JPanels paint()
	    Graphics2D g2d = (Graphics2D)g; // Casting Graphics to Graphics2D system. (better :P?)
	    g2d.drawImage(getBackgroundImage(),0,0,this); // Draws background
		p.draw(g2d);//Draws player
		c.draw(g2d);//Draws enemy
		
		
	}


	
	public Image getBackgroundImage()
	{
		ImageIcon i = new ImageIcon(getClass().getResource(background));
		return i.getImage();
	}
	@Override
	public void actionPerformed(ActionEvent ee)
	{
		
		p.update();
		c.update();
		System.out.println("Running game loop");
		repaint();	//Calls public void paint()
	}
}
