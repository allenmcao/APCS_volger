import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class program4
{
	public static void main (String[]args)
	{
		String height = JOptionPane.showInputDialog("Enter a height");
		String diameter = JOptionPane.showInputDialog("Enter a diameter");
		double heightNumb = Double.parseDouble(height);
		double diamNumb = Double.parseDouble(diameter);
		NumberFormat f = NumberFormat.getInstance();
		f.setMaximumFractionDigits(1);
		f.setMinimumFractionDigits(1);
		System.out.println("The surface area of the soda can formed by these parameters is " + f.format(heightNumb*(diamNumb*Math.PI)+ ((Math.pow((diamNumb/2),2)*Math.PI))*2));
		System.out.println("The volume of the soda can formed by these parameters is " + f.format(heightNumb*Math.pow((diamNumb/2),2)*Math.PI));
	}
}
		