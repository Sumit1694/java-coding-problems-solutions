package Arrays;

public class EvenAndOddSum {

	static void evenOrOddSum(int [] arr)
	{
		int evenSum = 0, oddSum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenSum += arr[i];
			}
			else
			{
				oddSum += arr[i];
			}
		}

		System.out.println("Even Sum: " + evenSum +"\n" + "Odd Sum: " + oddSum);
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6};
		evenOrOddSum(arr);

	}

}
