package studio7;

public class Rectangle1 {

	private double Length;
	private double Width;
	private double Area;
	private double Perimeter;	

	// Constructor:
	public Rectangle1()
	{
		this.Length = 1.0;
		this.Width = 1.0;

	}

	public Rectangle1 (double initLength, double initWidth)
	{
		this.Length = initLength;
		this.Width = initWidth;

	}

	public double areaCalc()
	{
		return (Length * Width);
	}

	public double perimeterCalc()
	{
		return (2 * Length) + (2 * Width);
	}


	public void print()
	{
		System.out.println("Area: " + areaCalc());
		System.out.println("Perimeter: " + perimeterCalc());
		System.out.println(rectangleCheck());



	}

	public String rectangleCheck()
	{
		if (Length == Width)
		{
			return "This is a square.";
		}

		else
		{
			return "This is a not square.";

		}
	}


	public String areaCheck(double initArea)
	{
		return "rectangle1 is larger than rectangle2.";
	}
	

	public static void main(String[] args)
	{
		Rectangle1 rectangle1 = new Rectangle1();
		Rectangle1 rectangle2 = new Rectangle1(2.0, 4.0);


		rectangle1.print();
		
		rectangle2.print();
		rectangle1.rectangleCheck();
		rectangle2.rectangleCheck();

		if (rectangle1.areaCalc() > rectangle2.areaCalc())
		{
			System.out.println("rectangle1 is larger than rectangle2.");	
		}

		else if (rectangle1.areaCalc() == rectangle2.areaCalc())
		{
			System.out.println("rectangle1 is equal in size to rectangle2.");	
		}

		else 
		{
			System.out.println("rectangle2 is larger than rectangle1.");	
		}



	}


}
