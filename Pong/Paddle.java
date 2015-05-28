/**
 *	Class to create a paddle object.
 */
import java.util.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Paddle extends Observable
{
	private Color color;
	private Location loc;
	private final int WIDTH=5;
	private final int HEIGHT=70;
	public static final int INCREMENT = 20;

	private int screenWidth;
	private int screenHeight;

	/**
	 *	Creates a red paddle at location (0,0) with no radius
	 */
	public Paddle(int width, int height)
	{
		color = Color.RED;
		loc = new Location();
		screenWidth=width;
		screenHeight=height;
	}

	/**
	 *	Creates a paddle with values passed
	 *	@param col the color of the paddle
	 *	@param l the location of the paddle
	 *	@theRadius the radius of the paddle
	 */
	public Paddle(Color col, Location l, int width, int height)
	{
		color = col;
		loc = l;
		screenWidth = width;
		screenHeight = height;
	}

	/**
	 *	Creates a paddle with values passed
	 *	@param col the color of the paddle
	 *	@param x the x coordinate of the paddle
	 *	@param y the y coordinate of the paddle
	 *	@theRadius the radius of the paddle
	 */
	public Paddle(Color col, int x, int y, int width, int height)
	{
		color = col;
		loc = new Location(x, y);
		screenWidth = width;
		screenHeight = height;
	}

	/**
	 *	paddle moves to the right
	 *	@post-condition the location of the paddle is moved INCREMENT
	 *					pixels to the right on the x-axis
	 */
	public void moveUp()
	{
		if(getY()>0)
			loc.setY(loc.getY()-INCREMENT);
		setChanged();
		notifyObservers();
	}

	public void moveDown()
	{
		if((getY()+HEIGHT)<screenHeight)
			loc.setY(loc.getY()+INCREMENT);
		setChanged();
		notifyObservers();
	}

	public int getWidth()
	{
		return WIDTH;
	}

	public int getHeight()
	{
		return HEIGHT;
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
	 *	Returns the location of the paddle
	 *	@return returns the location of the paddle
	 */
	public Location getLocation()
	{
		return loc;
	}

	/**
	 *	Returns the x-coordinate of the paddle
	 *	@return returns the x-coordinate of the paddle
	 */
	public int getX()
	{
		return loc.getX();
	}

	/**
	 *	Returns the y-coordinate of the paddle
	 *	@return returns the y-coordinate of the paddle
	 */
	public int getY()
	{
		return loc.getY();
	}

	/**
	 *	Returns the color of the paddle
	 *	@return returns the color of the paddle
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 *	Changes the location of the paddle
	 *	@param x the new x-coordinate of the paddle
	 *	@param y the new y-coordinate of the paddle
	 */
	public void setLocation(int x, int y)
	{
		loc.setX(x);
		loc.setY(y);
	}

	/**
	 *	Changes the x-coordinate of the paddle
	 *	@param x the new x-coordinate of the paddle
	 */
	public void setX(int x)
	{
		loc.setX(x);
	}

	/**
	 *	Changes the y-coordinate of the paddle
	 *	@param y the new y-coordinate of the paddle
	 */
	public void setY(int y)
	{
		loc.setY(y);
	}

	/**
	 *	Returns all the information about the paddle
	 *	@return returns a string containing the paddle's color,
	 *			x & y coordinate and radius
	 */
	public String toString()
	{
		return "Color: "+ color + " Location: " + loc;
	}
}

