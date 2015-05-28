public class GreeterTest
	{
	   public static void main(String[] args)
	   {
	      Greeter worldGreeter = new Greeter("World");
	      System.out.println(worldGreeter.sayHello());
	
	      Greeter daveGreeter = new Greeter("Dave");
	      System.out.println(daveGreeter.sayHello());
	      System.out.println(daveGreeter.refuseHelp());
	   }
	}