package Arrays;

public class FirstSubArrayWithSumK {

	static void firstSubArray(int [] arr, int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum = 0;

			for(int j=i;j<arr.length;j++)
			{
			    sum += arr[j];

			    if(sum==k)
			    {
			    	for(int l=i;l<=j;l++)
			    	{
			    		System.out.print(arr[l]+" ");
			    	}
			    	return;
			    }
			}
		}
		System.out.println("No subarray found!");
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,7,5};
		int k = 12;
		firstSubArray(arr, k);



	}
}