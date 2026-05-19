package Inheritance;

class Animal
{
	void makesSound()
	{
		System.out.println("Animal makes sound...");
	}
}

class Cat extends Animal
{
	void makesSound()
	{
		System.out.println("Cat quarells...");
	}
}

public class InheritanceType1 {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Cat cat = new Cat();

		animal.makesSound();
		cat.makesSound();

	}

}
