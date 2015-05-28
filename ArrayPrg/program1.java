import javax.swing.JOptionPane;

public class program1
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Enter a line of text:");
		int[] letters = new int[26];
		for(int k=0;k<input.length();k++)
			if(Character.isLetter(input.charAt(k)))
				letters[Character.toUpperCase(input.charAt(k))-'A']++;
		for(int k=0;k<letters.length;k++)
			if(letters[k]!=0)
				System.out.println((char)(97+k)+ "'s = " + letters[k]);	
	}
}