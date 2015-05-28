import javax.swing.*;
import java.awt.*;

/**
	The class JFrameDemo inherits from the JFrrame class (extends inherits from)
	The JFrame class is a container.  The constructor calls methods from teh JFrame class.
*/

public class JFrameDemo extends JFrame
{
	public JFrameDemo()
	{
		// The following methods can be found in the JFrame class API
		super("JFrame Demo");	// Set the title in the title bar
		setSize(400, 428);	// Title bar is 28 pixels so there is a usable 400 x 400 pixel window
		setResizable(false);	// User can't resize the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Clicking the close button quits the application
	}
	
	public static void main(String[] args)
	{
		JFrameDemo test = new JFrameDemo();	// Gotta create the JFrame object!
		test.setVisible(true);	// Make the JFrame visible
	}

}
