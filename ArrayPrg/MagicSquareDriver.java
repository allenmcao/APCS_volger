public class MagicSquareDriver
{
	public static void main(String[] args)
	{
		MagicSquare ms = new MagicSquare(3);
		System.out.println(ms);
		System.out.println("Sum is " + ms.magicSquareSum());
		System.out.println("Magic sqaure value " + ms.isMagicSquare());
	}
}