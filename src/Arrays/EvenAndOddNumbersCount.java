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

	public static void main(String[] args) {

		int [] arr = {2,5,8,11,14};
        EvenAndOddCount1(arr);
	}

}
