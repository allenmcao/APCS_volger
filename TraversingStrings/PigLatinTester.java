public class PigLatinTester
{
	public static void main(String[] agrs)
	{
		PigLatin pig = new PigLatin("You love to program in Java");
		System.out.println(pig + " in Pig Latin is: " + pig.pigLatinPharse());
		if (pig.pigLatinPharse().trim().equalsIgnoreCase("ouYay ovelay otay rogrampay niay avaJay"))
			System.out.println("Tiay Orkswya. Reatgay!!!");
		else
			System.out.println("Tiay oesn'tday orkway...");
	}
}