/**
 *	This class stores a fraction and/or mixed number.
 *	A Fraction is composed of three parts:
 *		1 - A whole number part (which could be zero)
 *		2 - A numerator part (which could be zero)
 *		3 - A denominator part (which is always positive)
 *
 *	If the value is negative and there is no whole part then only the numerator is negative (never the denominator).
 *	If the value negative and there is a whole part, only the whole part is negative, both numerator and denominator are positive.
 *	Given a fraction that can be reduced (e.g. 4/8), any of the arithmetic operations may reduce the fraction, and it will not appear
 *	in the non-reduced form after arithmetic operation is completed (e.g. 1/2).
 */

public class Fraction
{
	// Instance variables go here
	private int whole;
	private int numer;
	private int denom;
	/**
	 *	Creates a Fraction object with no whole part, no numerator
	 *	and a denominator of 1
	 */
	public Fraction()
	{
		whole = 0;
		numer = 0;
		denom = 1;
	}
	
	/**
	 *	Creates a Fraction object with no whole part, and a numerator
	 *	and denominator from the values passed
	 *	@param theNumerator the numerator for the fraction
	 *	@param theDenominator the denominator for the fraction
	 */
	public Fraction(int theNumerator, int theDenominator)
	{
		whole = 0;
		numer = theNumerator;
		denom = theDenominator;
	}

	/**
	 *	Creates a Fraction object with the whole part, numerator
	 *	and denominator from the values passed
	 *	@param theWholePart the whole part for the fraction
	 *	@param theNumerator the numerator for the fraction
	 *	@param theDenominator the denominator for the fraction
	 */
	public Fraction(int theWholePart, int theNumerator, int theDenominator)
	{
		whole = theWholePart;
		numer = theNumerator;
		denom = theDenominator;
	}
	
	/**
	 *	This methods reduces the fraction to its lowest form.  If improper
	 *	it first makes it proper, then reduces to the lowest denominator possible.
	 *	@precondition if there is a whole number it contains the sign,
	 *					if there is no whole number the numerator contains the sign
	 *	@postcondition This fraction is in proper form with the lowest denominator possible
	 */
	public void reduce()
	{
		if (numer>0)
		{
			int gcd = Math.abs(gcd(numer,denom));
			numer = numer/gcd;
			denom = denom/gcd;
		}
		
		else if (numer == 0)
		{
			numer = 0;
			denom = 1;
		}
		
		else
		{
			numer = (numer/Math.abs(gcd(numer,denom)));
			denom = (denom/Math.abs(gcd(numer,denom)));
		}
			
		if (whole>=0)
			whole += numer/denom;
		else
			whole -= numer/denom;
		if (numer>=0)
			numer = numer - numer/denom*denom;
		else
			numer = -(numer - numer/denom*denom);	
	}
	
	/**
	 *	Puts the fraction in improper form.  Removes the whole part
	 *	and adds it to the numerator.  The sign is preserved in the numerator.
	 */
	public void makeImproper()
	{
		if (whole>=0)
			numer = whole*denom + numer;
		else
			numer = -whole*denom - numer;
	}
	
	/**
	 *	Returns the denominator for this fraction
	 *	@return returns the denominator
	 */
	public int getDenominator()
	{
		return denom;
	}
	
	/**
	 *	Returns the numerator for this fraction
	 *	@return returns the numerator
	 */
	public int getNumerator()
	{
		return numer;
	}
	
	/**
	 *	Returns the whole part for this fraction
	 *	@return returns the whole part
	 */
	public int getWhole()
	{
		return whole;
	}

	/*
	 *	Changes the denominator
	 *	@param d the new denominator
	 *	@precondition newDenominator > 0
	 *	@postcondition sets denominator to the value passed if positive
	 *					otherwise sets denominator to 1. Denominator can never <= 0
	 */
	public void setDenominator(int newDenominator)
	{
		if (newDenominator>0)
			denom = newDenominator;
		else
			denom = 1;
	}
	
	/*
	 *	Changes the numerator
	 *	@param newNumerator the new numerator
	 */
	public void setNumerator(int newNumerator)
	{
		numer = newNumerator;
	}
	
	/*
	 *	Changes the whole part
	 *	@param newWhole the new whole part
	 */
	public void setWhole(int newWhole)
	{
		whole = newWhole;
	}
	
	/**
	 *	Negates the fraction.
	 *	If positive makes it negative, otherwise
	 *	if negative makes it positive, otherwise
	 *	if 0 it does nothing.
	 */
	public void negate()
	{
		if (whole != 0)
			whole = -whole;
		else
			numer = -numer;
	}
	
	/**
	 *	Adds a fraction passed to this object, producing another
	 *	Fraction object that is the sum of the two.
	 *	@param other the other Fraction to add to this Fraction object
	 *	@return returns a Fraction object that is the sum of other Fraction and this Fraction
	 */
	public Fraction add(Fraction other)
	{
		if (other.whole>=0 && whole >=0 && other.numer>=0 && numer>=0)
		{
			Fraction herp = new Fraction (whole,numer,denom);
			herp.makeImproper();
			Fraction derp = new Fraction(other.whole, other.numer,other.denom);
			derp.makeImproper();
			int denomLCM = lcm(derp.denom, denom);
			Fraction sum = new Fraction(numer*(denomLCM/denom) + derp.numer*(denomLCM/derp.denom), denomLCM);
			sum.reduce();
			return sum;
		}
		else if (other.whole>=0 && whole <0 || other.numer>=0 && numer <0)
		{
			Fraction herp = new Fraction (whole,numer,denom);
			herp.makeImproper();
			Fraction derp = new Fraction(other.whole, other.numer,other.denom);
			derp.makeImproper();
			int denomLCM = lcm(derp.denom, denom);
			Fraction sum = new Fraction(numer*(denomLCM/denom) + -derp.numer*(denomLCM/derp.denom), denomLCM);
			sum.reduce();
			return sum;
		}
		else if (other.whole<=0 && whole >=0 || other.numer <=0 && numer>=0)
		{
			Fraction herp = new Fraction (whole,numer,denom);
			herp.makeImproper();
			Fraction derp = new Fraction(other.whole, other.numer,other.denom);
			derp.makeImproper();
			int denomLCM = lcm(derp.denom, denom);
			Fraction sum = new Fraction(-numer*(denomLCM/denom) + derp.numer*(denomLCM/derp.denom), denomLCM);
			sum.reduce();
			return sum;
		}
		else
		{
			Fraction herp = new Fraction (whole,numer,denom);
			herp.makeImproper();
			Fraction derp = new Fraction(other.whole, other.numer,other.denom);
			derp.makeImproper();
			int denomLCM = lcm(derp.denom, denom);
			Fraction sum = new Fraction(-numer*(denomLCM/denom) + -derp.numer*(denomLCM/derp.denom), denomLCM);
			sum.reduce();
			return sum;
		}
	}
	
	/**
	 *	Subtracts a fraction passed to this object, producing another
	 *	Fraction object that is the difference of the two.
	 *	@param other the other Fraction to subtract from this Fraction object
	 *	@return returns a Fraction object that is the difference of other Fraction subtracted from this Fraction
	 */
	public Fraction subtract(Fraction other)
	{
		Fraction derp = new Fraction(other.whole, other.numer,other.denom);
		int denomLCM = lcm(derp.denom, denom);
		Fraction sum = new Fraction(whole-derp.whole, numer*(denomLCM/denom) - derp.numer*(denomLCM/derp.denom), denomLCM);
		sum.reduce();
		return sum;
	}

	/**
	 *	Multiplies a fraction passed to this object, producing another
	 *	Fraction object that is the product of the two.
	 *	@param other the other Fraction to multiply to this Fraction object to
	 *	@return returns a Fraction object that is the product of other Fraction and this Fraction
	 */
	public Fraction multiply(Fraction other)
	{
		Fraction derp = new Fraction(other.whole, other.numer,other.denom);
		derp.makeImproper();
		Fraction multiply = new Fraction((whole*denom + numer)*derp.numer, denom*derp.denom);
		multiply.reduce();
		return multiply;
	}

	/**
	 *	Divides a fraction passed to this object, producing another
	 *	Fraction object that is the quotient of the two.
	 *	@param other the other Fraction to divide into this Fraction object
	 *	@return returns a Fraction object that is the quotient of the this Fraction divided by the other Fraction
	 */
	public Fraction divide(Fraction other)
	{
		Fraction derp = new Fraction(other.whole, other.numer,other.denom);
		derp.makeImproper();
		Fraction divide = new Fraction((whole*denom + numer)*derp.denom, denom*derp.numer);
		divide.reduce();
		return divide;
	}
	
	/**
	 *	Returns the Least Common Multiple of 2 integer values
	 *	@param a first integer value to find the LCM of
	 *	@param b second integer value to find the LCM of
	 *	@returns returns the least common multiple of a and b
	 */
	private static int lcm(int a, int b)
	{
		return b * a / gcd(a, b);
	}
	
	/**
	 *	Returns the Greatest Common Divisor of 2 integer values
	 *	@param x first integer value to find the GCD of
	 *	@param y second integer value to find the GCD of
	 *	@precondition x > 0 and y > 0
	 *	@returns returns the greatest common divisor of x and y
	 */
	private static int gcd(int x, int y)
	{
		int r;
		for (r = x % y; r != 0; x = y, y = r, r = x % y);
		return y;
	}
	
	/**
	 *	Returns true if this Fraction object and the other Fraction object passed have
	 *	the same value
	 *	@param other the Fraction object to compare this Fraction object too.
	 *	@return returns true if other Fraction and this Fraction have the same value, otherwise returns false
	 */
	public boolean equals(Fraction other)
	{
		Fraction derp = new Fraction(other.whole, other.numer,other.denom);
		derp.reduce();
		derp.makeImproper();

		Fraction herp = new Fraction(whole,numer,denom);
		herp.reduce();
		herp.makeImproper();
		
		if (herp.numer == derp.numer && herp.denom == derp.denom)
			return true;
		else
			return false;
	}

	/**
	 *	Returns a String containing the fraction in the form:
	 *		wholePart numerator/denominator
	 *	If there is no whole part nothing is returned in the 'wholePart'
	 *	If the fraction is 0 nothing is returns in the 'numerator/denominator'
	 *	If both parts are 0 then return just 0 in the 'wholePart'
	 *	@return returns a string containing the fraction
	 */
	public String toString()
	{
		if (whole == 0 && numer == 0)
		{
			return "0";
		}
		else if (whole !=0 && numer ==0)
		{
			return Integer.toString(whole);
		}
		else
		{
			return Integer.toString(whole) + " " + Integer.toString(numer) + "/" + Integer.toString(denom);
		}
	}
}
