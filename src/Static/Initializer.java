package Static;

public class Initializer {

	static int initialValue;

	static {
		initialValue = 1000;
		System.out.println("Static block: Initial value to: " + initialValue);
	}

	public static void main(String[] args) {

		System.out.println("Before creating instance = " + Initializer.initialValue);

		Initializer i = new Initializer();

		System.out.println("After creating instance: " + Initializer.initialValue);




	}

}
