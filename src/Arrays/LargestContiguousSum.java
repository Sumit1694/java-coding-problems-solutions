package Arrays;

public class LargestContiguousSum {

	static int maxSum(int [] arr)
	{
		int maxSum = 0;

		for(int i=0;i<arr.length;i++)
		{
			int sum = 0;

			for(int j=i;j<arr.length;j++)
			{
				sum += arr[j];
				if(sum>maxSum)
				{
					maxSum = sum;
				}
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {

		int [] arr = {-3,-4,4,-1,-2,1,5,-3};
		System.out.println(maxSum(arr));

	}

}
