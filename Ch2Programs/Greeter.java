public class Greeter
{
	public Greeter(String aName)
	{
	    name = aName;
	}
	
	public String sayHello()
	{
	    String message = "Hello, " + name + "!";
	    return message;
	}
	
	public String refuseHelp()
	{
		return "I am sorry, " + name + ", I am afraid I can't do that.";
	}
	
	private String name;
}