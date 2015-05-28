import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;

public class McDonalds extends JFrame
{

	public McDonalds()
	{
		//give the window a title
		super("Hello Goodbye Window");
		setSize(800, 400);
		
		//create the two buttons
		Register r = new Register();
		FoodItem hamburger = new FoodItem("Hamburger", r, 1.99);
		FoodItem frys = new FoodItem("Frys", r, .5);
		FoodItem coke = new FoodItem("Coke", r, .89);
		FoodItem chickenNuggets = new FoodItem("Chicken Nuggets", r, 2.99);
		OrderButton total = new OrderButton("Total", r);

		//place them on the frame
		Container c = getContentPane();
		//makes items appear in a grid - one row, two columns
		c.setLayout(new GridLayout(1,5));
		c.add(hamburger);
		c.add(frys);
		c.add(coke);
		c.add(chickenNuggets);
		c.add(total);

		//make the computer wait for the buttons to be clicked
		hamburger.addMouseListener(new Mouser());
		frys.addMouseListener(new Mouser());
		coke.addMouseListener(new Mouser());
		chickenNuggets.addMouseListener(new Mouser());
		total.addMouseListener(new Mouser());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}