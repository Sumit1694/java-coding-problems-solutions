package Arrays;

public class SubArraySumWithSlidingWindow {

	static int maxSum(int [] arr, int k)
	{
		int maxSum = Integer.MIN_VALUE;

		for(int i=0;i<=arr.length-k;i++)
		{
			int sum = 0;

			for(int j=i;j<i+k;j++)
			{
				sum += arr[j];
			}
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}

	static int maxSum1(int [] arr, int k)
	{
		int wSum = 0;
		int mSum = Integer.MIN_VALUE;

		for(int i=0;i<k;i++)
		{
			wSum += arr[i];
		}

		for(int i=k;i<arr.length;i++)
		{
			wSum = wSum - arr[i-k] + arr[i];
			mSum = Math.max(mSum, wSum);
		}
		return mSum;
	}

	public static void main(String[] args) {

		int [] arr = {2,9,31,-4,21,7};
		int k = 3;
		System.out.println(maxSum(arr, k));
		System.out.println(maxSum1(arr ,k));
	}
}