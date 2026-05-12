package Arrays;

import java.util.*;

public class MaximumElementInArray {

	static int largestElement1(int [] arr)
	{
		int max = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}

	static int largestElement2(int [] arr)
	{
		Arrays.sort(arr);

		return arr[arr.length-1];
	}

	public static void main(String[] args) {

		int [] arr = {3,8,2,15,6};
		System.out.println(largestElement1(arr));
		System.out.println(largestElement2(arr));
	}
}
