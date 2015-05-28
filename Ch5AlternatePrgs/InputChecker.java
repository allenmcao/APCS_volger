public class InputChecker
{
	private String lower;
	
	public InputChecker(String derp)
	{
		lower = derp.toLowerCase();
	}
	
	public boolean yes()
	{
		if(lower.equals("yes") || lower.equals("y") || lower.equals("ok")  || lower.equals("sure")  || lower.equals("why not?") )
			return true;
		else
			return false;
	}
	
	public boolean no()
	{
		if (lower.equals("no") || lower.equals("n"))
			return true;
		else
			return false;
	}
}