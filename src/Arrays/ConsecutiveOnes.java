package Arrays;

public class ConsecutiveOnes {

	static int maxConsecutiveOnes(int [] arr)
	{
		int count = 0;
		int maxCount = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
			    count++;
			}
			else if(maxCount<count)
			{
				maxCount = count;
				count = 0;
			}
		}

		return maxCount;
	}

	public static void main(String[] args) {

		int [] arr = {1,1,0,1,1,1,0};
		System.out.println(maxConsecutiveOnes(arr));

	}

}
