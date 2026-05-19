package Numbers;

public class isArmstrongNumber {

	static void isArmstrong(int n)
	{
		int original = n;
		int cube = 0;

		while(n>0)
		{
		    int last = n%10;
		    cube = cube + (last*last*last);
		    n = n / 10;
		}

		if(original==cube)
		{
			System.out.println("Armstrong number!");
		}
		else
		{
			System.out.println("Not a armstrong number!");
		}
	}

	public static void main(String[] args) {

		int n = 371;
		isArmstrong(n);

	}

}
