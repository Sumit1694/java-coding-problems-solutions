package NestedClasses;

public class Car {

	void startEngine()
	{
		class Engine
		{
			void run()
			{
				System.out.println("Engine is running.");
			}
		}

		Engine engine = new Engine();
		engine.run();
	}

	public static void main(String[] args) {

		Car c = new Car();
		c.startEngine();
	}
}