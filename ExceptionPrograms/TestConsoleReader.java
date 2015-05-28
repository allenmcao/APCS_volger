public class TestConsoleReader
{
	public static void main (String[]args)
	{
		ConsoleReader c = new ConsoleReader();
		boolean error;
		int a = 0;
		do{
			error=false;
			try{
				System.out.print("Enter an integer:");
				a = c.readInt();
			}
			catch(Exception e)
			{
				System.out.println(e);
				error=true;
			}
		}while(error);
		System.out.println("Value is " + a);
		
		int b = 0;
		do{
			error=false;
			try{
				System.out.print("Enter another integer:");
				b = c.readInt();
			}
			catch(Exception e)
			{
				System.out.println(e);
				error=true;
			}
		}while(error);
		System.out.println("Next value is " + b);
		
		try{
			System.out.println("Sum is " + Calculator.add(a,b));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		
		try{
			System.out.println("Difference is " + Calculator.minus(a,b));
		}
		catch(DontLikeParameterException e)
		{
			System.out.println(e);
		}
	}
}