package Numbers;

import java.util.Scanner;

public class AllDivisors {

	static void allDivisors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		allDivisors(n);
		sc.close();
	}
}