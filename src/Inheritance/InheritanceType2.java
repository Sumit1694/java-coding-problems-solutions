package Inheritance;

class Vehicle
{
	void drive()
	{
		System.out.println("Reparing a Vehicle");
	}
}

class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Repairing a car");
	}
}

public class InheritanceType2 {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		Car c = new Car();
		v.drive();
		c.drive();


	}

}
