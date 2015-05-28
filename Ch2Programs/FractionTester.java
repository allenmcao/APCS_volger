public class FractionTester
{
	public static void main(String[] args)
	{
		Fraction f = new Fraction();
		
		f.setWhole(0);
		f.setNumerator(0);
		f.setDenominator(4);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);
		
		f.setWhole(3);
		f.setNumerator(0);
		f.setDenominator(4);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);

		f.setWhole(-5);
		f.setNumerator(0);
		f.setDenominator(4);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);

		f.setWhole(0);
		f.setNumerator(-2);
		f.setDenominator(4);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);

		f.setWhole(0);
		f.setNumerator(4);
		f.setDenominator(2);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);

		f.setWhole(0);
		f.setNumerator(-4);
		f.setDenominator(2);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);

		f.setWhole(6);
		f.setNumerator(4);
		f.setDenominator(2);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);

		f.setWhole(-6);
		f.setNumerator(4);
		f.setDenominator(2);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);

		f.setWhole(6);
		f.setNumerator(5);
		f.setDenominator(2);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);

		f.setWhole(-6);
		f.setNumerator(5);
		f.setDenominator(2);
		System.out.print(f);
		f.reduce();
		System.out.println(" reduced is " + f);
		
		Fraction f1 = new Fraction(7,8);
		Fraction f2 = new Fraction(5,6);
		
		System.out.println("*********************************************");
		System.out.println("Sum of " + f1 + " and " + f2 + " is " + f1.add(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Product of " + f1 + " and " + f2 + " is " + f1.multiply(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Difference of " + f1 + " and " + f2 + " is " + f1.subtract(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Quotient of " + f1 + " and " + f2 + " is " + f1.divide(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("*********************************************");
		f1.setWhole(-6);
		f1.setNumerator(5);
		f1.setDenominator(2);
		f2.setWhole(6);
		f2.setNumerator(4);
		f2.setDenominator(2);
		System.out.println("Sum of " + f1 + " and " + f2 + " is " + f1.add(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Sum of " + f1 + " and " + f2 + " is " + f1.add(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Product of " + f1 + " and " + f2 + " is " + f1.multiply(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Difference of " + f1 + " and " + f2 + " is " + f1.subtract(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Quotient of " + f1 + " and " + f2 + " is " + f1.divide(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("*********************************************");
		f1.setWhole(-6);
		f1.setNumerator(5);
		f1.setDenominator(2);
		f2.setWhole(-6);
		f2.setNumerator(4);
		f2.setDenominator(2);
		System.out.println("Sum of " + f1 + " and " + f2 + " is " + f1.add(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Sum of " + f1 + " and " + f2 + " is " + f1.add(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Product of " + f1 + " and " + f2 + " is " + f1.multiply(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Difference of " + f1 + " and " + f2 + " is " + f1.subtract(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("Quotient of " + f1 + " and " + f2 + " is " + f1.divide(f2));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println("*********************************************");

		f1.setWhole(-6);
		f1.setNumerator(5);
		f1.setDenominator(2);
		f2.setWhole(0);
		f2.setNumerator(-17);
		f2.setDenominator(2);
		System.out.println(f1 + " and " + f2 + " the same? " + f1.equals(f2) + " and " + f2.equals(f1));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println(f1 + " and " + f2 + " the same? " + f1.equals(f2) + " and " + f2.equals(f1));
		f1.setWhole(0);
		f1.setNumerator(1);
		f1.setDenominator(2);
		f2.setWhole(0);
		f2.setNumerator(5);
		f2.setDenominator(10);
		System.out.println(f1 + " and " + f2 + " the same? " + f1.equals(f2) + " and " + f2.equals(f1));
		System.out.println("Original fractions are " + f1 + " and " + f2);
		System.out.println(f1 + " and " + f2 + " the same? " + f1.equals(f2) + " and " + f2.equals(f1));
		
	}
}