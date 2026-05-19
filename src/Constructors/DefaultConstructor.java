package Constructors;

class Cat
{
	String name;
	int age;

	public Cat()
	{
		this.name = "Unknown";
		this.age = 0;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {

        Cat myCat = new Cat();
        System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());

	}
}