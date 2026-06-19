package Arrays;

import java.util.*;

public class FindDuplicateNumber {

	static int dp(int [] arr)
	{
		Arrays.sort(arr);

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1] == arr[i])
			{
				return arr[i];
			}
		}
		return -1;
	}

	static int dp1(int [] arr)
	{
		Set<Integer> set = new HashSet<>();

		for(int n:arr)
		{
			if(!set.add(n))
			{
				return n;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {1,3,4,2,2};
		System.out.println(dp(arr));
		System.out.println(dp1(arr));
	}

}
