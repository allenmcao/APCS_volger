public class Year
{
	private int year;
	private int month;
	private int day;
	
	public Year(int year1)
	{
		year = year1;
		int a = year%19;
		int b = year/100;
		int c = year%100;
		int d = b/4;
		int e = b%4;
		int g = (8*b + 13)/25;
		int h = (19*a + b - d - g + 15)%30;
		int j = c/4;
		int k = c%4;
		int m = (a + 11*h)/319;
		int r = (2*e + 2*j - k - h + m + 32)%7;
		month = (h - m + r + 90)/25;
		day = (h - m + r + month + 19)%32;
	}
	
	public int getEasterSundayMonth()
	{
		return month;
	}
	
	public int getEasterSundayDay()
	{
		return day;
	}
}