package Constructors;

class Dog
{
	String name;
	String color;

	public Dog(String name,String color)
	{
		this.name = name;
		this.color = color;
	}

	public String getName()
	{
		return name;
	}

	public String getColor()
	{
		return color;
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {

		Dog dog = new Dog("Puppy","White");
		System.out.println("Dog Name: " + dog.getName());
		System.out.println("Dog Color: " + dog.getColor());

	}
}