public class AnimalSounds
{
	public static void main(String[] args)
	{
		Frog f1 = new Frog("Riivveett!?!");
		Frog f2 = new Frog("!Riverrivet");
		Animal c;
		if (f1.compareTo(f2) < 0)
			c = f1;
		else
			c = f2;
		c.speak();
		
		Cat c1 = new Cat("Morris's meow");
		Cat c2 = new Cat("Garfield's meow");
		if (c1.compareTo(c2) < 0)
			c = c1;
		else
			c = c2;
		c.speak();
		
		/*
			1.  Create three Animal reference variables and assigned them to
			    3 created Cats.
			2.  Call the findQuietest method and store the result in an Animal
			    reference variable.
			3.  Output the sound of the quietest animal found.
			4.  Create three Animal reference variables and assigned them to
			    3 created Frogs.
			5.  Call the findQuietest method and store the result in an Animal
			    reference variable.
			6.  Output the sound of the quietest animal found.
		*/
		
		Animal x = new Cat("MEOWTH");
		Animal y = new Cat("MRRROWWWWW-COUGH");
		Animal z = new Cat("HISSSSSSSSSSSSSSSSS");
		Animal d = findQuietest(x,y,z);
		d.speak();
		
		Animal e = new Frog("Rubbit?");
		Animal f = new Frog("RIBITTT!!!!!!");
		Animal g = new Frog("River-rivet!?!?!?!?");
		Animal h = findQuietest(e,f,g);
		h.speak();
		
	}
	
	/**
		This method compares three animals and returns the animal
		that makes the least noise (smallest sound).
		@precondition all Animal objects have been implemented with Comparable
		              and all Animal objects passed are of the same type.
		@param a the first animal to compare.
		@param b the second animal to compare.
		@param c the third animal to compare
		@return returns the quietest animal (the one with the smallest sound).
		@poscondtion The quietest animal is found and returned.
	*/
	public static Animal findQuietest(Animal a, Animal b, Animal c)
	{
		Animal d;
		if (a.compareTo(b)<0)
			d = a;
		else
			d = b;
		if (d.compareTo(c)>0)
			d = c;
		return d;	// Dummy statement to allow the class to compile
	}
}