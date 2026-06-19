package Arrays;

import java.util.Arrays;

public class LargestPairSum {

	static int sum(int [] arr)
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

		return max1 + max2;
	}

	static int sum1(int [] arr)
	{
		Arrays.sort(arr);

		int largest = arr[arr.length-1];

		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]!=largest)
			{
				 return largest + arr[i];
			}
		}

		return largest;
	}

	public static void main(String[] args) {

		int [] arr = {10,20,30,40};
		System.out.println(sum(arr));
		System.out.println(sum1(arr));
	}

}
