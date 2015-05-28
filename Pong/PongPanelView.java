/**
 *	Creates a panel for which to display the unitss in.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Observer;
import java.util.Observable;
import java.util.List;
import java.awt.*;

public class PongPanelView extends JPanel implements Observer
{
	private Units unit;

	/**
	 *	Sets the background to this panel to light blue
	 */
	public PongPanelView()
	{
		setBackground(new Color(255,255,255));
	}


	/**
	 *	Paints all the unitss on the panel
	 *	@param g - the Graphics object in which to paint
	 */
	public void paintComponent(Graphics g)
	{
   		Font font = new Font("Arial", Font.PLAIN, 24);

    	g.setFont(font);

		super.paintComponent(g);
		// Draw the units - Use the Graphics class method fillOval
		if(unit.getScore1()<11&&unit.getScore2()<11)
		{
			//Draw the puck
			g.setColor(unit.getPuck().getColor());
			g.fillOval(unit.getPuck().getX(), unit.getPuck().getY(), unit.getPuck().getDiameter(), unit.getPuck().getDiameter());
			// Draw the paddles
			g.setColor(unit.getPaddle1().getColor());
			g.fillRect(unit.getPaddle1().getX(), unit.getPaddle1().getY(), unit.getPaddle1().getWidth(), unit.getPaddle1().getHeight());
			g.setColor(unit.getPaddle2().getColor());
			g.fillRect(unit.getPaddle2().getX(), unit.getPaddle2().getY(), unit.getPaddle2().getWidth(), unit.getPaddle2().getHeight());
			//Draw the scores
			g.drawString(unit.getScore1()+"",0,24);
			g.drawString(unit.getScore2()+"",unit.getScreenWidth()-30,24);
		}
		else if (unit.getScore1()<11)
		{
			g.drawString("PLAYER ONE WINS",unit.getScreenWidth()/2,unit.getScreenHeight()/2);
			repaint();
			long start = System.currentTimeMillis();
			long end = start + 3*1000; // 60 seconds * 1000 ms/sec
			while (System.currentTimeMillis() < end)
			{
			}
			unit.reset();
		}
		else if (unit.getScore2()<11)
		{
			g.drawString("PLAYER TWO WINS",unit.getScreenWidth()/2,unit.getScreenHeight()/2);
			repaint();
			long start = System.currentTimeMillis();
			long end = start + 3*1000; // 60 seconds * 1000 ms/sec
			while (System.currentTimeMillis() < end)
			{
			}
			unit.reset();
		}
	}

	/**
    	This is executed when a changed has been observed
    	@param o is the object that we are observing that a change has taken place
    	@param arg an optional argument - not used here
    */
    public void update(Observable o, Object arg)
    {
    	// Get the object we are observing - the unitsField
    	Units unitz = (Units)o;
    	unit = unitz;
    	// paint the panel
    	repaint();
    }

}