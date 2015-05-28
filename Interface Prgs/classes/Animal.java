public interface Animal extends Comparable
{
	/**
	 *	Displays the sound the Animal makes
	 */
	void speak();
	
	/**
	 *	This method is in the interface because I extended Comaprable
	 *	above.  Is is shown here in comments only to let you know that
	 *	it must be included in any class that implements the Animal
	 *	interface
	 *
	 *	Returns a positive integer if this is greater than obj
	 *	Returns 0 if this is the same as obj
	 *	Returns a negative integer if this is smaller than obj
	 *	@param obj the object to compare this too
	 *	@return returns positive, 0 or negative int
	 */
	// int compareTo(Object obj);	// This method comes from the Raw Comparable Interface
}