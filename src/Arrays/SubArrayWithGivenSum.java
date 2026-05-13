package Arrays;

public class SubArrayWithGivenSum {

	static void subArrayWithSum(int [] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum = 0;
			for(int j=i;j<arr.length;j++)
			{
				sum += arr[j];

				if(sum==target)
				{
					System.out.println("Subarray: ");

					for(int k=i;k<=j;k++)
					{
						System.out.print(arr[k] + " ");
					}
					return;
				}
			}
		}
		System.out.println("No subarray found!");
	}

	public static void main(String[] args) {

		int [] arr = {1, 4, 20, 3, 10, 5};
		subArrayWithSum(arr, 33);

	}

}
