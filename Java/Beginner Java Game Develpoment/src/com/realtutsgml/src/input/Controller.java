package com.realtutsgml.src.input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import com.realtutsgml.src.objects.Enemy;

public class Controller 
{
	
	public Controller()
	{
		addEnemy(new Enemy(100, 100));
		addEnemy(new Enemy(150, 100));
		addEnemy(new Enemy(200, 100));
		addEnemy(new Enemy(250, 100));
		addEnemy(new Enemy(300, 100));
	}
	
	static LinkedList<Enemy> e = new LinkedList<Enemy>(); 
	
	Enemy TempEnemy;
	
	public void draw (Graphics2D g2d)
	{
		for (int i = 0; i < e.size(); i++)
		{
			TempEnemy = e.get(i);	// Gets enemy from LinkedList
			
			TempEnemy.draw(g2d);
		}
	}
	
	public void update() 
	{
		for (int i = 0; i < e.size(); i++)
		{
			TempEnemy = e.get(i);	// Gets enemy from LinkedList
			
			TempEnemy.update();
		}
	}
	
	public void addEnemy(Enemy enemy)
	{
		e.add(enemy);
	}
	public void removeEnemy(Enemy enemy)
	{
		e.remove(enemy);
	}
	
	public static LinkedList<Enemy> getEnemyBounds()
	{
		return e;
	}
	
	
}
