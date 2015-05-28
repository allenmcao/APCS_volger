import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import java.lang.Exception;

public class MapDriverTester
{
	public static void main(String[] args)
	{
		// Make sure the TheMap is set to 4x4 and only the 4x4 data is selected
		TheMap m1 = new TheMap(4, 4);
		
		boolean[] results = {false,true,true,true,true,true,true,true,false,true};
		boolean works = true;
		
		int row, col;

		row = 1; col = 2;
		works = works && (m1.canFlowOffMap(row, col) == results[0]);
			
		row = 2; col = 1;
		works = works && (m1.canFlowOffMap(row, col) == results[1]);
			
		row = 2; col = 2;
		works = works && (m1.canFlowOffMap(row, col) == results[2]);
			
		row = 3; col = 2;
		works = works && (m1.canFlowOffMap(row, col) == results[3]);
		

		/****************************************************************************************
		*	Create a 10x10 Map
		*****************************************************************************************/
		TheMap m2 = new TheMap(10, 10);

		row = 2; col = 2;
		works = works && (m2.canFlowOffMap(row, col) == results[4]);
			
		row = 3; col = 0;
		works = works && (m2.canFlowOffMap(row, col) == results[5]);
			
		row = 0; col = 3;
		works = works && (m2.canFlowOffMap(row, col) == results[6]);
			
		row = 3; col = 1;
		works = works && (m2.canFlowOffMap(row, col) == results[7]);
			
		row = 6; col = 1;
		works = works && (m2.canFlowOffMap(row, col) == results[8]);

		row = 7; col = 2;
		works = works && (m2.canFlowOffMap(row, col) == results[9]);
		
		if (works)
			System.out.println("Your Map algorithm works!");
		else
			System.out.println("Doesn't work");
			
		System.exit(0);	
	}
}
