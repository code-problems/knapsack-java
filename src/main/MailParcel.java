package main;

public class MailParcel 
{
	private double lengthInFeet;
	private double widthInFeet;
	private double heightInFeet;
	private boolean isPriority;
	
	public MailParcel(double lengthInFeet, double widthInFeet, double heightInFeet, boolean isPriority)
	{
		this.lengthInFeet = lengthInFeet;
		this.widthInFeet = widthInFeet;
		this.heightInFeet = heightInFeet;
		this.isPriority = isPriority;
	}
	
	public double getLengthInFeet()
	{
		return lengthInFeet;
	}
	
	public double getWidthInFeet()
	{
		return widthInFeet;
	}
	
	public double getHeightInFeet()
	{
		return heightInFeet;
	}
	
	public boolean isPriority() 
	{
		return isPriority;
	}
}