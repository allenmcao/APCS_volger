public class test 
{

    public static void main (String[]args)
    {
	    String word = "This is, a test!";
		System.out.println(words(word));
    }   
    
    public static int words(String derp)
	{
		int numWords=0;
		for (int n = 0; n < derp.length(); n++)
		{
			if (derp.charAt(n) == ' ');
			{
				numWords++;
				System.out.println(numWords);
			}
		}
		return numWords-1;
	}
}