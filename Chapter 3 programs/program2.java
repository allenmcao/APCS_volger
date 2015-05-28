import javax.swing.JOptionPane;

public class program2
{
	public static void main (String[]args)
	{
		String number1 = JOptionPane.showInputDialog("Enter a number");
		String number2 = JOptionPane.showInputDialog("Enter another number");
		int numb1 = Integer.parseInt(number1);
		int numb2 = Integer.parseInt(number2);
		System.out.println("The sum of the numbers is " + (numb1+numb2));
		System.out.println("The difference of the numbers is " + (numb1-numb2));
		System.out.println("The product of the numbers is " + ((numb1*numb2)));
		System.out.println(("The average of the numbers is " + ((double)(numb1+numb2)/2)));
		System.out.println("The distance between the numbers is " + (Math.abs(numb1-numb2)));
		System.out.println("The larger number is " + (Math.max(numb1,numb2)));
		System.out.println("The smaller number is " + (Math.min(numb1,numb2)));
	}
}