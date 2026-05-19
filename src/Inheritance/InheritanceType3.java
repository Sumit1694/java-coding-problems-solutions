package Inheritance;

class Shape
{
	double getArea()
	{
		return 0.0;
	}
}

class Rectangle extends Shape
{
	private double length;
	private double width;

	public Rectangle(double length, double width)
	{
      this.length = length;
      this.width = width;
	}

    double getArea()
	{
	   return length * width;
	}
}

public class InheritanceType3 {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(3.0, 10.0);
		double area = rectangle.getArea();
		System.out.println("The area of rectangle is: " + area);
	}
}