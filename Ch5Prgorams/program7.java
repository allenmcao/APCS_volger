import javax.swing.JOptionPane;

public class program7
{
	public static void main (String[]args)
	{
		final double M_TO_IN = 39.3701;
		final double F_TO_IN = 12;
		final double M_TO_F = 3.28084;
		
		String from = JOptionPane.showInputDialog("Convert from?");
		String to = JOptionPane.showInputDialog("Convert to?");
		String valueS = JOptionPane.showInputDialog("Value?");
		
		String fromLower = from.toLowerCase();
		String toLower = to.toLowerCase();
		double value = Double.parseDouble(valueS);
		double converted;
		
		if (fromLower.equals("in"))
			if (toLower.equals("m"))
				converted = value*(1/M_TO_IN);
			else
				converted = value*(1/F_TO_IN);
		else if (fromLower.equals("m"))
			if (toLower.equals("in"))
				converted = value*M_TO_IN;
			else
				converted = value*M_TO_F;
		else if (fromLower.equals("f")&&toLower.equals("in"))
			converted = value*F_TO_IN;
		else
			converted = value*(1/M_TO_F);
	
		System.out.println(value + " " + fromLower + " " + "=" + " " + converted + " " + toLower);
	}
}