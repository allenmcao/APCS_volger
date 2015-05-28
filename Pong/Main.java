import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements KeyListener, ActionListener
{
	private Units unit;
	private final int TIME_INC = 10;
	private final int WIDTH = 640;
	private final int HEIGHT = 477;
	
	private boolean up;
	private boolean down;
	private boolean q;
	private boolean a;
		
	public Main()
	{
		super("Pong");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		
		// Create the model
		unit = new Units(640,420);
		// Create the controller (the clock) and add the model as the listener
		Clock clock= new Clock(unit, TIME_INC);
		unit.setClock(clock);
		// Create the view
		PongPanelView view = new PongPanelView();
		// Assoicate the view with the model
		unit.addObserver(view);
		// Display the view of the model
		view.update(unit,null);
		// Add the view to this frame
		Container c = getContentPane();
		c.add(view);
				
		setResizable(false);
		unit.getClock().start();
		addKeyListener( this );
		
		JMenu speedMenu = new JMenu("Options");
        JMenuItem s; 

        s = new JMenuItem("New Game"); 
        s.addActionListener(this);
        speedMenu.add(s); 
        
        JMenuBar sBar = new JMenuBar();
        sBar.add(speedMenu);
        setJMenuBar(sBar);
	}
	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() ==  KeyEvent.VK_UP)    
			up=true;
        if (e.getKeyCode() ==  KeyEvent.VK_DOWN)  
        	down=true;
        if (e.getKeyChar() ==  'q')               
        	q=true;
        if (e.getKeyChar() ==  'a')               
        	a=true;
        if(up)
        	unit.movePaddles(0,1);
        if(down)
        	unit.movePaddles(0,-1);
        if(q)
        	unit.movePaddles(1,0);
        if(a)
        	unit.movePaddles(-1,0);
	}
	
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() ==  KeyEvent.VK_UP)    
			up=false;
        if (e.getKeyCode() ==  KeyEvent.VK_DOWN)  
        	down=false;
        if (e.getKeyChar() ==  'q')               
        	q=false;
        if (e.getKeyChar() ==  'a')               
        	a=false;
	}
	
	public void keyTyped(KeyEvent e)
	{
	}
	
	public void actionPerformed(ActionEvent e) 
    {
    	String actionCommand = e.getActionCommand();
        if (actionCommand.equals("New Game"))
        {
        	unit.reset();
        }
    }
	
	public static void main(String[] args)
	{
		Main Pucks = new Main();
		Pucks.setVisible(true);
	}
	
}