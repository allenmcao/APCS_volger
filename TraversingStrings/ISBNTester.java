public class ISBNTester
{
	public static void main(String[] args)
	{
		ISBN isbn = new ISBN("011111111j");
		System.out.println(isbn + " is " + isbn.isValidISBN());
		isbn = new ISBN("0471469009");
		System.out.println(isbn + " is " + isbn.isValidISBN());
		isbn = new ISBN("0201748355");
		System.out.println(isbn + " is " + isbn.isValidISBN());
		isbn = new ISBN("080442957X");
		System.out.println(isbn + " is " + isbn.isValidISBN());
		isbn = new ISBN("08044295X7");
		System.out.println(isbn + " is " + isbn.isValidISBN());
		isbn = new ISBN("0804429579X");
		System.out.println(isbn + " is " + isbn.isValidISBN());
		isbn = new ISBN("080442957");
		System.out.println(isbn + " is " + isbn.isValidISBN());
		isbn = new ISBN("0804429X7");
		System.out.println(isbn + " is " + isbn.isValidISBN());
	}
}

