package Arrays;

import java.util.Arrays;

public class SecondSmallestElement {

	static int secondSmallest(int [] arr)
	{
		int min1 = 0, min2 = 0;

		if(arr[0]<arr[1])
		{
			min1 = arr[0];
			min2 = arr[1];
		}
		else
		{
			min1 = arr[1];
			min2 = arr[0];
		}

		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]<min1)
			{
				min2 = min1;
				min1 = arr[i];
			}
			else if(arr[i]<min2 && arr[i]!=min1)
			{
				min2 = arr[i];
			}
		}
		return min2;
	}

	static int secondSmallest1(int [] arr)
	{
		Arrays.sort(arr);

		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {3,7,1,2,7,8};
		System.out.println(secondSmallest(arr));
		System.out.println(secondSmallest1(arr));
	}
}