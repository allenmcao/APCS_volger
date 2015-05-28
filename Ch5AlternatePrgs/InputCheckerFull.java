import java.util.StringTokenizer;

public class InputCheckerFull
{
	public static void main(String[] args)
	{
		String noInputs = "No,nO,no,NO,n,N";
		String yesInputs = "Y,y,YES,yes,Yes,yEs,yeS,ok,OK,oK,Ok,sure,Sure,SURE,sUre,WHY NOT?,why Not?";
		String otherInputs = "YE,ys,OKYes,SURE OK,WHYNOT";
		
		System.out.println("-------------------------");
		System.out.println("Input\t\tno()\tyes()");
		System.out.println("-------------------------");
		StringTokenizer st = new StringTokenizer(noInputs,",");
		while (st.hasMoreTokens())
		{
			String input = st.nextToken();
			InputChecker c = new InputChecker(input);
			System.out.println(input + "\t\t\t" + c.no() + "\t" + c.yes());
		}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Input\t\tno()\tyes()");
		System.out.println("-------------------------");

		int ctr = 0;
		st = new StringTokenizer(yesInputs,",");
		while (st.hasMoreTokens())
		{
			String input = st.nextToken();
			InputChecker c = new InputChecker(input);
			ctr++;
			System.out.print(input);
			if (ctr <= 11)
				System.out.print("\t");
			if (ctr <= 15)
				System.out.print("\t");
			System.out.println("\t" + c.no() + "\t" + c.yes());
		}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Input\t\tno()\tyes()");
		System.out.println("-------------------------");
		ctr = 0;
		
		st = new StringTokenizer(otherInputs,",");
		while (st.hasMoreTokens())
		{
			String input = st.nextToken();
			InputChecker c = new InputChecker(input);
			ctr++;
			System.out.print(input);
			if (ctr <= 2)
				System.out.print("\t");
			System.out.println("\t\t" + c.no() + "\t" + c.yes());
		}
		System.out.println();
	}
}