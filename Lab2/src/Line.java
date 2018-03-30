public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;
	String cord1, cord2;
	
	public Line(double x1, double y1, double x2, double y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}
	public void setCoordinates()
	{
		cord1 = xOne + "," + xTwo;
		cord2 = yOne + "," + yTwo;
	}
	public void calculateSlope()
	{
		slope = (yTwo - yOne)/(xTwo - xOne);
	}

	public void print( )
	{
		System.out.println("The coordinates are (" + cord1 + ") (" + cord2 + ")");
		System.out.println("slope: " + slope);
	}
}