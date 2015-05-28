public class SodaCan
{
	private double height;
	private double width;
	
	public SodaCan(double numb1, double numb2)
	{
		height = numb1;
		width = numb2;
	}
	
	public double getVolume()
	{
		return height*Math.PI*Math.pow((width/2.0),2.0);
	}
	
	public double getSurfaceArea()
	{
		return (height*Math.PI*width)+ Math.PI*Math.pow((width/2.0),2.0)*2.0;
	}
}