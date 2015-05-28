import javax.swing.JOptionPane;

public class program3
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Input a letter grade (e.g. A+)");
		String grade = input.substring(0,1);
		String quality = input.substring(1);
		double numGrade;
		if (grade.equals("A"))
			numGrade = 4.0;
		else if (grade.equals("B"))
			numGrade = 3.0;
		else if (grade.equals("C"))
			numGrade = 2.0;
		else if (grade.equals("D"))
			numGrade = 1.0;
		else
			numGrade = 0.0;
			
		if (quality.equals("+")&& !grade.equals("A") && !grade.equals("F"))
			numGrade += 0.3;
		else if (quality.equals("-")&&!grade.equals("F"))
			numGrade -=0.3;
		
		System.out.println(numGrade);
	}
}