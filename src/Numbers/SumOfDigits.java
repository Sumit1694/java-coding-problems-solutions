package Numbers;

public class SumOfDigits {

	public static void main(String[] args) {

		int n = 549;
		int sum = 0;

		while(n>0)
		{
			int last = n%10;
			sum += last;
			n = n/10;
		}

		System.out.println("Sum of digits: " + sum);
	}
}