package Numbers;

public class PrimeNumbers {

	static boolean isPrime(int n) //Check from 2 till num-1, if it divides by any number then its not prime(loop goes 2 till n-1)
	{
		if(n<=1)
		{
			return false;
		}

		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	static boolean isPrimeOptimized1(int n) //Factors repeat after the square root of a number, so we only need to check up to the square root because every factor greater than √n has a corresponding factor smaller than √n.
	{
		if(n<=1)
		{
			return false;
		}

		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	static boolean isPrimeOptimized2(int n) //Same as above (O(ROOTN))
	{
		if(n<=1)
		{
			return false;
		}

		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	static boolean isPrimeOptimized3(int n) //number division is possible only till half of the element. further iterations are meaningless
	{
		if(n<=1)
		{
			return false;
		}

		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

       for(int i=2;i<=20;i++)
       {
    	   if(isPrime(i))
    	   {
    		   System.out.print(i+" ");
    	   }
       }

       System.out.println();

       for(int i=2;i<=20;i++)
       {
    	   if(isPrimeOptimized1(i))
    	   {
    		   System.out.print(i+" ");
    	   }
       }

       System.out.println();

       for(int i=2;i<=20;i++)
       {
    	   if(isPrimeOptimized2(i))
    	   {
    		   System.out.print(i+" ");
    	   }
       }

       System.out.println();

       for(int i=2;i<=20;i++)
       {
    	   if(isPrimeOptimized3(i))
    	   {
    		   System.out.print(i+" ");
    	   }
       }
	}

}
