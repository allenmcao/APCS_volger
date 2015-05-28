public class CarTester
{
	public static void main (String[]args)
	{
		Car myBeemer = new Car(29);		// Car gets 29 miles per gallon
		myBeemer.addGas(20);			// Add 20 gallons of gas to the tank
		myBeemer.drive(100);			// Drive the car 100 miles
		System.out.println(myBeemer.getGas());	// Prints the fuel remaining
	}
}