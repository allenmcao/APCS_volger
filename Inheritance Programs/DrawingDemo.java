import javax.swing.*;
import java.awt.*;

public class DrawingDemo extends JFrame
{
	public DrawingDemo()
	{
		// The following methods can be found in the JFrame class API
		super("JFrame Demo");	// Set the title in the title bar
		setSize(600, 728);	// Title bar is 28 pixels so there is a usable 400 x 400 pixel window
		setResizable(false);	// User can't resize the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Clicking the close button quits the applicaiton
		JPanel panel = new JPanelDemo();
		Container c = getContentPane();
		c.add(panel);
	}
	
	public static void main(String[] args)
	{
		DrawingDemo d = new DrawingDemo();
		d.setVisible(true);
	}
}