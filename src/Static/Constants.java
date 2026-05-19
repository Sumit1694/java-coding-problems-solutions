package Static;

public class Constants {

	public static final double PI = 3.14159;

	public static double areaOfCircle(double radius)
	{
		return PI * radius*radius;
	}

	public static void main(String[] args) {

	    double radius = 5.0;

	    double area = areaOfCircle(radius);

	    System.out.println("Radius: " + radius);
	    System.out.println("Area: " + area);

	}

}
