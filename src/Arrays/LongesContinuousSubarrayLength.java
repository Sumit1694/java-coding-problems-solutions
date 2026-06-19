package Arrays;

public class LongesContinuousSubarrayLength {

	static int longestLength(int [] arr)
	{
		int count = 1;
		int maxCount = 0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+1==arr[j])
				{
					count++;
				}
				else if(count>maxCount)
				{
					maxCount = count;

					count = 1;
					break;
				}
			}
		}

		return maxCount;
	}

	static int longestLength1(int [] arr)
	{
		int count = 1;
		int maxCount = 1;

		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
			{
				count++;
			}
			else
			{
				count = 1;
			}

			if(count>maxCount)
			{
				maxCount = count;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,1,2,3,4};
		System.out.println(longestLength(arr));
		System.out.println(longestLength1(arr));
	}

}
