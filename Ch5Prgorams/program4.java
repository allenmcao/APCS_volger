import javax.swing.JOptionPane;

public class program4
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Input a num grade (e.g. 4.0)");
		double grade = Double.parseDouble(input);
		String letterGrade;
		if (grade >= 3.85)
			letterGrade = "A";
		else if (grade >= 3.5)
			letterGrade = "A-";
		else if (grade >= 3.15)
			letterGrade = "B+";
		else if (grade >= 2.85)
			letterGrade = "B";
		else if (grade >= 2.5)
			letterGrade = "B-";
		else if (grade >= 2.15)
			letterGrade = "C+";
		else if (grade >= 1.85)
			letterGrade = "C";
		else if (grade >= 1.5)
			letterGrade = "C-";
		else if (grade >= 1.15)
			letterGrade = "D+";
		else if (grade >= 0.85)
			letterGrade = "D";
		else if (grade >= 0.5)
			letterGrade = "D-";
		else
			letterGrade = "F";
		System.out.println(letterGrade);
	}
}