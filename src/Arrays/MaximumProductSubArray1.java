package Arrays;

public class MaximumProductSubArray1 {

	static int maxProduct(int [] arr)
	{
		int max = arr[0];
		int min = arr[0];
		int result = arr[0];

		for(int i=1;i<arr.length;i++)
		{
			int temp = arr[i];

			if(temp<0)
			{
				int swap = max;
				max = min;
				min = swap;
			}

			max = Math.max(temp, max*temp);
			min = Math.min(temp, min*temp);

			result = Math.max(result, max);
		}

		return result;
	}
	public static void main(String[] args) {

		int [] arr = {2,3,-2,4};
		System.out.println(maxProduct(arr));

	}
}