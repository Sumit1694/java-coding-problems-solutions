package Arrays;

public class LongestConsecutiveSequenceUnsorted {

	static boolean search(int [] arr, int target)
	{
		for(int n:arr)
		{
			if(n==target)
			{
				return true;
			}
		}
		return false;
	}

	static int longest(int [] arr)
	{
		int maxLength = 0;

		for(int i=0;i<arr.length;i++)
		{
			int currNum = arr[i];
			int count = 1;

			while(search(arr , currNum+1))
			{
				currNum++;
				count++;
			}

			maxLength = Math.max(maxLength, count);
		}
		return maxLength;
	}

	public static void main(String[] args) {

	   int [] arr = {100,4,200,1,3,2};

	   System.out.println(longest(arr));
	}
}