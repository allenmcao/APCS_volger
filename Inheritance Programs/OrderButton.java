import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class OrderButton extends JButton implements Clickable
{
	private Register reg;
	
	public OrderButton(String name, Register r)
	{
		super(name);
		reg = r;
	}
	
	public void isClicked()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		JOptionPane.showMessageDialog(null,getText()+ "\n" + nf.format(reg.getTotal()));
	}
}