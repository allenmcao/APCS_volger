public class AnimalTest
{
	public static void main(String[] args)
	{
		Animal a = new Cat("MEOWTH");
		Animal b = new Cat("MRRROWWWWW-COUGH");
		Animal z = new Cat("HISSSSSSSSSSSSSSSSS");
		Animal d = AnimalSounds.findQuietest(a,b,z);
		d.speak();
		
		Animal e = new Frog("rub");
		Animal f = new Frog("RIBITTT!!!!!!");
		Animal g = new Frog("River-rivet!?!?!?!?");
		Animal h = AnimalSounds.findQuietest(e,f,g);
		h.speak();
	}

}