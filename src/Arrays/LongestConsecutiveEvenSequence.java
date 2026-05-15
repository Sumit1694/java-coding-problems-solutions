package Arrays;

public class LongestConsecutiveEvenSequence {

	static int LongestSequence(int [] arr)
	{
		int count = 0;
		int maxCount = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
				maxCount = Math.max(count, maxCount);
			}
			else
			{
				count = 0;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {

		int [] arr = {2,4,6,1,8,10,12,14,3,2};
		System.out.println(LongestSequence(arr));
	}
}