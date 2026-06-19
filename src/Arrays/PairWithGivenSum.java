package Arrays;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

	static void pairWithSum(int [] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i] +" , " + arr[j]);
					return;
				}
			}
		}

		System.out.println("pair not found!");
	}

	static void pairWithSumUsingSet(int [] arr, int target)
	{
		Set<Integer> set = new HashSet<>();

		for(int n:arr)
		{
			int complement = target - n;

			if(set.contains(complement))
			{
				System.out.println(complement +" , " + n);
				return;
			}
			set.add(n);
		}

		System.out.println("pair not found!");
	}

	static void pairWithSumUsingTwoPointers(int [] arr, int target)
	{
		int l=0, h=arr.length-1;

		while(l<h)
		{
			int sum = arr[l] + arr[h];

			if(sum==target)
			{
				System.out.println(arr[l] + " , " + arr[h]);
				return;
			}
			else if(sum<target)
			{
				l++;
			}
			else
			{
				h--;
			}
		}

		System.out.println("pair not found!");
	}

	public static void main(String[] args) {

		int [] arr = {2,7,11,15};
		int target = 9;
		pairWithSum(arr, target);
		pairWithSumUsingSet(arr, target);
		pairWithSumUsingTwoPointers(arr, target);

	}
}
