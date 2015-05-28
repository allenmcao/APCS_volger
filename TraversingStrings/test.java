import javax.swing.JOptionPane;

public class test 
{

    public static void main (String[]args)
    {
    	String input = JOptionPane.showInputDialog("Enter a word/sentence");
    	for (int k = input.length()-1; k >= 0; k--)
    	{
    		System.out.print(input.charAt(k));
    	}
    }   
}