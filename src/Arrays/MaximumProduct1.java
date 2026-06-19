package Arrays;

public class MaximumProduct1 {

	static int maxProduct(int [] arr)
	{
		int max1 = arr[0];
		int max2 = arr[1];
		
		if(max1>max2)
		{
			max1 = arr[0];
			max2 = arr[1];
		}
		else
		{
			max1 = arr[1];
			max2 = arr[0];
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i]>max2 && arr[i]!=max1)
			{
				max2 = arr[i];
			}
		}
		
		return max1 * max2;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40};
		System.out.println(maxProduct(arr));
		
	}
	
}
