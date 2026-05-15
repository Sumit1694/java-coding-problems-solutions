package Arrays;

public class CountEvenOrOdd {

	static void evenOrOdd(int [] arr)
	{
		int evenCount = 0, oddCount = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}

		System.out.println("Even count: " + evenCount + " Odd Count: " + oddCount);
	}

	public static void main(String[] args) {

		int [] arr = {2, 7,10, 15, 8};
		evenOrOdd(arr);
	}

}
