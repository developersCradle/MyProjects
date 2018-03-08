package com.realtutsgml.src.objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;


import com.realtutsgml.src.GlobalPosition;
import com.realtutsgml.src.MainClass;

public class Enemy extends GlobalPosition
{
	
	private String enemy = "/images/enemy.png";
	int speed = 5;
	
	public Enemy(int x, int y) 
	{
		super(x, y);
	}

	
	public void update()
	{
		x += speed;
		if (x > MainClass.WIDTH-96) // Minus size of enemy WIDTH
		{
			speed = -5;
		}
		if(x < 0)
		{
			speed = 5;
		}
	}
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getEnemyImage(),x,y, null);
	}
	
	public Rectangle getBounds()
	{
		return new Rectangle(x,y,96,64);
	}
	
	public Image getEnemyImage()
	{
		ImageIcon i = new ImageIcon( getClass().getResource(enemy));
		return i.getImage();
	}
}

