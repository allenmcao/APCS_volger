/**
 *	Class to create a puck object.
 */
import java.util.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Puck extends Observable
{
	private Color color;
	private Location loc;
	private int radius;
	public static final int INCREMENT = 2;

	private boolean horizontal;
	private boolean vertical;

	private boolean diagonalup;
	private boolean diagonaldown;

	private int screenWidth;
	private int screenHeight;

	/**
	 *	Creates a red puck at location (0,0) with no radius
	 */
	public Puck(int width, int height)
	{
		color = Color.RED;
		loc = new Location();
		radius = 0;
		horizontal=false;
		vertical = false;
		screenWidth=width;
		screenHeight=height;
		diagonalup=false;
		diagonaldown=false;
	}

	/**
	 *	Creates a puck with values passed
	 *	@param col the color of the puck
	 *	@param l the location of the puck
	 *	@theRadius the radius of the puck
	 */
	public Puck(Color col, Location l, int theRadius, int width, int height)
	{
		color = col;
		loc = l;
		radius = theRadius;
		horizontal=false;
		vertical = false;
		screenWidth = width;
		screenHeight = height;
		diagonalup=false;
		diagonaldown=false;
	}

	/**
	 *	Creates a puck with values passed
	 *	@param col the color of the puck
	 *	@param x the x coordinate of the puck
	 *	@param y the y coordinate of the puck
	 *	@theRadius the radius of the puck
	 */
	public Puck(Color col, int x, int y, int theRadius, int width, int height)
	{
		color = col;
		loc = new Location(x, y);
		radius = theRadius;
		horizontal=false;
		vertical = false;
		screenWidth = width;
		screenHeight = height;
		diagonalup=false;
		diagonaldown=false;
	}

	/**
	 *	puck moves to the right
	 *	@post-condition the location of the puck is moved INCREMENT
	 *					pixels to the right on the x-axis
	 */
	public void move()
	{
		if(getY()<=0)
		{
			reverseVer();
			if(diagonalup)
			{
				diagonalup=false;
				diagonaldown=true;
			}
			else if(diagonaldown)
			{
				diagonalup=true;
				diagonaldown=false;
			}
		}
		else if(getY()+2*radius>=screenHeight)
		{
			reverseVer();
			if(diagonalup)
			{
				diagonalup=false;
				diagonaldown=true;
			}
			else if(diagonaldown)
			{
				diagonalup=true;
				diagonaldown=false;
			}
		}

		if(horizontal)
			loc.setX(loc.getX() + INCREMENT);
		else
			loc.setX(loc.getX() - INCREMENT);

		if(diagonalup)
			loc.setY(loc.getY() + 1);
		if(diagonaldown)
			loc.setY(loc.getY() - 1);

		if (vertical)
			loc.setY(loc.getY() + INCREMENT);
		else
			loc.setY(loc.getY() - INCREMENT);
		setChanged();
		notifyObservers();
	}

	public boolean getDiagonalUp()
	{
		return diagonalup;
	}

	public boolean getDiagonalDown()
	{
		return diagonaldown;
	}

	public void setDiagonalUp(boolean yes)
	{
		diagonalup=yes;
	}

	public void setDiagonalDown(boolean derp)
	{
		diagonaldown=derp;
	}

	public void resetter()
	{
		loc= new Location(screenWidth/2, screenHeight/2);

	}

	public void reverseHor()
	{
		horizontal=!horizontal;
	}

	public void reverseVer()
	{
		vertical = !vertical;
	}

	public boolean getHorizontal()
	{
		return horizontal;
	}

	public boolean getVertical()
	{
		return vertical;
	}

	public void changeColor()
	{
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		color = new Color(r,g,b);
	}

	/**
	 *	Returns the location of the puck
	 *	@return returns the location of the puck
	 */
	public Location getLocation()
	{
		return loc;
	}

	/**
	 *	Returns the x-coordinate of the puck
	 *	@return returns the x-coordinate of the puck
	 */
	public int getX()
	{
		return loc.getX();
	}

	/**
	 *	Returns the y-coordinate of the puck
	 *	@return returns the y-coordinate of the puck
	 */
	public int getY()
	{
		return loc.getY();
	}

	/**
	 *	Returns the color of the puck
	 *	@return returns the color of the puck
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 *	Returns the radius of the puck
	 *	@return returns the radius  of the puck
	 */
	public int getRadius()
	{
		return radius;
	}

	/**
	 *	Returns the diameter of the puck
	 *	@return returns the diameter  of the puck
	 */
	public int getDiameter()
	{
		return 2 * radius;
	}

	/**
	 *	Changes the location of the puck
	 *	@param x the new x-coordinate of the puck
	 *	@param y the new y-coordinate of the puck
	 */
	public void setLocation(int x, int y)
	{
		loc.setX(x);
		loc.setY(y);
	}

	/**
	 *	Changes the x-coordinate of the puck
	 *	@param x the new x-coordinate of the puck
	 */
	public void setX(int x)
	{
		loc.setX(x);
	}

	/**
	 *	Changes the y-coordinate of the puck
	 *	@param y the new y-coordinate of the puck
	 */
	public void setY(int y)
	{
		loc.setY(y);
	}

	/**
	 *	Returns all the information about the puck
	 *	@return returns a string containing the puck's color,
	 *			x & y coordinate and radius
	 */
	public String toString()
	{
		return "Color: "+ color + " Location: " + loc + " Radius: " + radius;
	}
}

