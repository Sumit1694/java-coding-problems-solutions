package Others;

public class PowerOf2 {

	static boolean powOf2(int n)
	{
		if(n==0)
		{
			return false;
		}

		return (n & (n-1))==0;
	}

	public static void main(String[] args) {

		int n = 64;
		System.out.println(powOf2(n));

	}

}
