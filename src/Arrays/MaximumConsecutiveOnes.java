package Arrays;

public class MaximumConsecutiveOnes {

	static int maxConsecutiveOnes(int [] arr)
	{
		int maxCount = 0;

		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==1)
				{
					count++;
				}
				else
				{
					break;
				}
			}
			maxCount = Math.max(count, maxCount);
		}
		return maxCount;
	}

	static int maxConsecutive(int [] arr)
	{
		int count = 0;
		int maxCount = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count = 0;
			}
			else
			{
				count++;
				maxCount = Math.max(count, maxCount);
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {

		int [] arr = {0,1,1,0,0,1,1,1,0};
		System.out.println(maxConsecutiveOnes(arr));
		System.out.println(maxConsecutive(arr));

	}

}