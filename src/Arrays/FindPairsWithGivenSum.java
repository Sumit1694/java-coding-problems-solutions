package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindPairsWithGivenSum {

	static void pairs1(int [] arr, int target)
	{
		int l=0, h=arr.length-1;

		while(l<h)
		{
			if(arr[l]+arr[h]>target)
			{
				h--;
			}
			else if(arr[l]+arr[h]<target)
			{
				l++;
			}
			else if(arr[l]+arr[h]==target)
			{
				System.out.println("Pair (" +arr[l] + " , " + arr[h] + ") ");
			    l++;
			    h--;
			}
		}
	}

	static void pairs2(int [] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("Pair (" +arr[i] + " , " + arr[j] + ") ");
				}
			}
		}
	}

	static void Pair3UsingSet(int [] arr, int target)
	{
		Set<Integer> set = new HashSet<>();

		for(int num:arr)
		{
			int temp = target - num;

			if(set.contains(temp))
			{
				System.out.println("Pair (" + temp + " , " + num + ")");
			}
			set.add(num);
		}
	}

	static void pair4UsinMap(int [] arr, int target)
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int num:arr)
		{
			int temp = target - num;

			if(map.containsKey(temp))
			{
				System.out.println("Pair (" + temp + " , " + num + ")");
			}
			map.put(num, map.getOrDefault(num, 0)+1);
		}
	}

	public static void main(String[] args) {

		int [] arr = {2, 7, 11, 15};
		int target = 9;
		pairs1(arr, target);
		pairs2(arr, target);
		Pair3UsingSet(arr, target);
		pair4UsinMap(arr, target);
	}
}
