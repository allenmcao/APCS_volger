import javax.swing.*;
import java.awt.*;

/**
	JPanelDemo inherits from the JPanle class, which is a container.
*/

public class JPanelDemo extends JPanel
{
	
	public JPanelDemo()
	{
		setBackground(Color.WHITE);	// Set the background of the panel to yellow
	}

	/**
		This method is called when the this panel needs to be displayed or
		re-displayed.  It can be called manuulay bby calling the repaint()
		method for this object.
	*/
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		// The following methods can be found in the Graphics class API
		g.setColor(Color.YELLOW);  // Set the color to red
		g.fillOval(90, 100, 50, 50);	// Draws a  red circle
		g.setColor(Color.RED);
		g.fillRect(105, 150, 20, 100);	// Draws a blue rectangle
		g.fillRect(40, 170, 60, 20);
		g.fillRect(120, 170, 60, 20);
		g.setColor(Color.BLUE);
		g.fillRect(90, 250, 20,100);
		g.fillRect(120, 250, 20,100);
		
		g.setColor(Color.YELLOW);  // Set the color to red
		g.fillOval(390, 100, 50, 50);	// Draws a  red circle
		g.setColor(Color.RED);
		g.fillRect(405, 150, 20, 100);	// Draws a blue rectangle
		g.fillRect(340, 170, 60, 20);
		g.fillRect(420, 170, 60, 20);
		g.setColor(Color.BLUE);
		g.fillRect(390, 250, 20,100);
		g.fillRect(420, 250, 20,100);
	}

}