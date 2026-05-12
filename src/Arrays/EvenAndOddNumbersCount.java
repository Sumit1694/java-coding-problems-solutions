package Arrays;

public class EvenAndOddNumbersCount {

	static void EvenAndOddCount1(int [] arr)
	{
		int evenCount = 0;
		int oddCount = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else if(arr[i]%2!=0)
			{
				oddCount++;
			}
		}

		System.out.println("Even count: " + evenCount + " Odd count: " + oddCount);
	}

	static void EvenAndOddCount2(int [] arr)
	{
		int evenCount = 0;
		int oddCount = 0;

		for(int i:arr)
		{
			if(i%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}

		System.out.println("Even count: " + evenCount + " Odd count: " + oddCount);
	}

	static void EvenAndOddCount3(int [] arr)
	{
		int evenCount = 0;
		int oddCount = 0;

		for(int i:arr)
		{
			if((i&1)==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}

		System.out.println("Even count: " + evenCount + " Odd count: " + oddCount);
	}

	static void EvenAndOddCount4(int [] arr)
	{
		int evenCount = 0;
		int oddCount = 0;

		for(int i:arr)
		{
			evenCount += (i%2==0) ? 1 : 0;
			oddCount += (i%2!=0) ? 1 : 0;
		}

		System.out.println("Even count: " + evenCount + " Odd count: " + oddCount);
	}


	public static void main(String[] args) {

		int [] arr = {2,5,8,11,14};
        EvenAndOddCount1(arr);
        EvenAndOddCount2(arr);
        EvenAndOddCount3(arr);
        EvenAndOddCount4(arr);
	}

}
