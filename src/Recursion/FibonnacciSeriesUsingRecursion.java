package Recursion;

public class FibonnacciSeriesUsingRecursion {

	static int fibo(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}

		return fibo(n-1) + fibo(n-2);
	}

	public static void main(String[] args) {

		for(int i=1;i<=10;i++)
		{
			System.out.print(fibo(i)+" ");
		}
	}
}