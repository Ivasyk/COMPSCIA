//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int a ,int b ,int c ,int d)
	{
		xPos = a;
		yPos = b;
		width = c;
		height = d;
	}
	
	public Block(int a ,int b ,int c ,int d , Color col)
	{
		xPos = a;
		yPos = b;
		width = c;
		height = d;
		color = col;
	}
	
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   private void setWidth(int a)
   {
	   width = a;
   }
   
   private void setHeight(int a)
   {
	   height = a;
   }

   private void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos = y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}   
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}