package Numbers;

public class EachNumberFromOneTONEvenOrOdd {

	static void evenOrOdd(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i + " " + "Even");
			}
			else
			{
				System.out.println(i + " " + "Odd");
			}
		}
	}

	public static void main(String[] args) {

		int n = 5;
		evenOrOdd(n);
	}
}