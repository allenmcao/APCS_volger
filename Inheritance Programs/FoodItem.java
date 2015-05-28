import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class FoodItem extends JButton implements Clickable
{
	private Register reg;
	private double price;
	
	public FoodItem(String name, Register r, double p)
	{
		super(name);
		reg = r;
		price = p;
	}
	
	public void isClicked()
	{
		reg.addTotal(price);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		JOptionPane.showMessageDialog(null,getText()+ " " + nf.format(price));
	}
}