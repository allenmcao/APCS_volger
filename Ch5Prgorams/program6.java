import javax.swing.JOptionPane;

public class program6
{
	public static void main (String[]args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		String wage = JOptionPane.showInputDialog("What is your hourly wage?");
		String hours = JOptionPane.showInputDialog("How many hours did you work, " + name + "?");
		int wageNum = Integer.parseInt(wage);
		int hoursNum = Integer.parseInt(hours);
		double pay;
		if (hoursNum >= 40)
			pay = 1.5*wageNum*(hoursNum-40) + (wageNum*40);
		else
			pay = (wageNum*hoursNum);
		System.out.println(name + ", you are to be paid " + pay + " dollars");
	}
}