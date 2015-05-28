import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Rollerrrr
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Number of sides on the dice?");
		int x = Integer.parseInt(input);
		Dice a = new Dice(x);
		Dice b = new Dice(x);
		int[] list = new int[2*x];
		for(int k=0;k<1000;k++)
			list[a.roll()+b.roll()-2]++;
			
		NumberFormat f = NumberFormat.getInstance();
		f.setMinimumFractionDigits(1);
		f.setMaximumFractionDigits(1);
		for(int k=0;k<list.length-1;k++)
			System.out.println((k+2)+"'s was rollerrrred " + list[k] + " times which is " + f.format((double)list[k]/1000*100) + "%");
		System.out.println();
		
		int largestsum=list[0];
		for(int k=1;k<list.length-1;k++)
			if(largestsum<list[k])
				largestsum=list[k];
		for(int k=0;k<list.length-1;k++)
		{
			System.out.print((k+2)+"'s \t");
			for(int z=0;z<Math.round((double)list[k]/largestsum*20);z++)
				System.out.print("*");
			System.out.println();
		}
	}
}