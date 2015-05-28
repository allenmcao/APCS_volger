public class MyIntegerTester
{
	public static void main(String[] args)
	{
		MyInteger num1 = new MyInteger("1492");
		System.out.println(num1.parseInt());
		MyInteger num2 = new MyInteger("-999");
		System.out.println(num2.parseInt());
		System.out.println("1492 + (-999) = " + (num1.parseInt() + num2.parseInt()));
	}
}