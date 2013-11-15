package finalProject;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class BroDude
{
int x;
int changeX;
int y;
int changeY;
Image still;
ImageIcon right = new ImageIcon("C:/BroDudeCharacterArrowRight.png");
ImageIcon left = new ImageIcon("C:/BroDudeCharacterArrowLeft.png");

	public BroDude()
	{
		
		still = right.getImage();
		x = 10;
		y = 570;
		
	}
	
	public void move()
	{
		x = x + changeX;
		y = y + changeY;
		
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public Image getImage()
	{
		return still;
	}
	
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT)
		{
			changeX = -1;
			still = left.getImage();
		}
		
		if (key == KeyEvent.VK_RIGHT)
		{
			changeX = 1;
			still = right.getImage();
		}
		

	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT)
		changeX = 0;
		
		if (key == KeyEvent.VK_RIGHT)
		changeX = 0;
	
	}
}

