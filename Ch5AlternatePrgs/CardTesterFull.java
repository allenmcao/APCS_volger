import java.util.StringTokenizer;

public class CardTesterFull
{
	public static void main(String[] args)
	{
		String suites = "CHDS";
		String values = "2,3,4,5,6,7,8,9,10,J,Q,K,A";
		
		for (int s = 0; s < suites.length(); s++)
		{
			String card = suites.substring(s, s+1);
			StringTokenizer st = new StringTokenizer(values,",");
			while (st.hasMoreTokens())
			{
				String description = st.nextToken() + card;
				Card c = new Card(description);
				System.out.println(description + "\t" + c.getDescription());
			}
			System.out.println();
		}
	}
}