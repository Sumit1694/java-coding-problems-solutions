package NestedClasses;

public class Computer {

	class Processor
	{
		public void displayDetails()
		{
			System.out.println("Computer brand: " + "Dell");
			System.out.println("Computer Speed: " + "I7");
		}
	}

	void showProcessorDetails()
	{
		Processor p = new Processor();
		p.displayDetails();
	}

	public static void main(String[] args) {

		Computer c = new Computer();
		c.showProcessorDetails();

	}

}
