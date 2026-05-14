package Recursion;

public class PrintnNumbers {

	static void printNumber(int n)
	{
		if(n==0)
		{
			return;
		}

		System.out.print(n+" ");
		printNumber(n-1);
	}

	static void printNumberReverse(int n)
	{
		if(n==0)
		{
			return;
		}

		printNumberReverse(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {

		int n = 5;
		printNumber(n);
		System.out.println();
		printNumberReverse(n);

	}

}
