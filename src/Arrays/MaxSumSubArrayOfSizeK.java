package Arrays;

public class MaxSumSubArrayOfSizeK {

	static int maxSumSubarray(int [] arr, int k)
	{
		int maxSum = 0;

		for(int i=0;i<=arr.length-k;i++)
		{
			int sum = 0;

			for(int j=i;j<i+k;j++)
			{
				sum += arr[j];
			}

			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}

	static int maxSumSubArrayOptimized(int [] arr, int k)
	{
		int wSum = 0;

		for(int i=0;i<k;i++)
		{
			wSum += arr[i];
		}

		int maxSum = wSum;

		for(int i=k;i<arr.length;i++)
		{
			wSum = wSum - arr[i-k] + arr[i];
			maxSum = Math.max(maxSum, wSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {

		int [] arr = {2,1,5,1,3,2};
		System.out.println(maxSumSubarray(arr, 3));
	    System.out.println(maxSumSubArrayOptimized(arr, 3));

	}
}