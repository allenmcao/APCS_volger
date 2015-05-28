public class ISBN
{
	private String isbn;
	
	public ISBN(String num)
	{
		isbn = num;
	}
	
	public boolean isValidISBN()
	{
		if (isbn.length()!=10)
			return false;
		
		boolean digits = false;
		for (int k = 0; k < 8; k++)
		{
			if (Character.isDigit(isbn.charAt(k)))
				digits=true;
			else
				return false;		
		}
		if (Character.isDigit(isbn.charAt(9))||isbn.charAt(9)=='X')
			digits=true;
		else
			return false;
		
		boolean valid = false;
		
		int sum = (10*Character.digit(isbn.charAt(0),10) + 9*Character.digit(isbn.charAt(1),10) + 8*Character.digit(isbn.charAt(2),10)			+ 7*Character.digit(isbn.charAt(3),10)  + 6*Character.digit(isbn.charAt(4),10)  + 5*Character.digit(isbn.charAt(5),10)  
		+ 4*Character.digit(isbn.charAt(6),10)  + 3*Character.digit(isbn.charAt(7),10)  + 2*Character.digit(isbn.charAt(8),10)  + 
		Character.digit(isbn.charAt(9),10));
		
		if (isbn.charAt(9)!='X')
		{	
			if (sum%11==0)
				valid = true;
		}
		else
		{			
			if (sum%11==0)
				valid = true;
		}
		
		if (valid&&digits)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return isbn;
	}
}

/**(10*Character.digit(isbn.charAt(0),1) + 9*Character.digit(isbn.charAt(1),2)  + 8*Character.digit(isbn.charAt(2),3)
			+ 7*Character.digit(isbn.charAt(3),4)  + 6*Character.digit(isbn.charAt(4),5)  + 5*Character.digit(isbn.charAt(5),6)  
			+ 4*Character.digit(isbn.charAt(6),7)  + 3*Character.digit(isbn.charAt(7),8)  + 2*Character.digit(isbn.charAt(8),9)  + 
			Character.digit(isbn.charAt(9),10))**/