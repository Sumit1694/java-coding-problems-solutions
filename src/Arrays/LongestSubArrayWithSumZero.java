package Arrays;

public class LongestSubArrayWithSumZero {

	static int longestSumSubArray(int [] arr)
	{
		int maxLength = 0;

		for(int i=0;i<arr.length;i++)
		{
			int sum = 0;

			for(int j=i;j<arr.length;j++)
			{
				sum += arr[j];

				if(sum==0)
				{
					maxLength = Math.max(maxLength, j-i+1);
				}
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {

		int [] arr = {15,-2,2,-8,1,7,10,23};
		System.out.println(longestSumSubArray(arr));
	}

}
