package Arrays;

public class MaximumDIfference {

	static int maxDifference(int [] arr)
	{
		int max = arr[0];
		int min = arr[0];

		for(int n:arr)
		{
			if(n>max)
			{
				max = n;
			}

			if(n<max)
			{
				min = n;
			}
		}

		return max - min;
	}

	public static void main(String[] args) {

		int [] arr = {10,20,30,50};
		System.out.println(maxDifference(arr));
	}

}
