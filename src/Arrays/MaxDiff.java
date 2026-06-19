package Arrays;

public class MaxDiff {

	static int maxDiff(int [] arr)
	{
		int max = 0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
		        int diff = arr[j] - arr[i];

		        if(diff>max)
		        {
		        	max = diff;
		        }
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int [] arr = {2,3,10,6,4,8,1};
		System.out.println(maxDiff(arr));
	}
}