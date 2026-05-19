package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	static int [] indices(int [] arr, int target)
	{
		int [] ind = {-1,-1};

		for(int i=0;i<arr.length;i++)
		{
			int remains = target - arr[i];

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==remains)
				{
					return new int[] {i,j};
				}
			}
		}
		return ind;
	}

	static int [] indices1(int [] arr, int target)
	{
		Arrays.sort(arr);

		int l=0, h=arr.length-1;

		while(l<h)
		{
			int sum = arr[l] + arr[h];
			if(sum==target)
			{
				return new int[] {l, h};
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

		return new int[] {-1,-1};
	}

	static int [] indices2(int [] arr, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0;i<arr.length;i++)
		{
			int diff = target - arr[i];

			if(map.containsKey(diff))
			{
               return new int[] {map.get(diff), i};
			}
			map.put(arr[i], i);
		}

		return null;
	}

	public static void main(String[] args) {

		int [] arr = {2,7,11,15};
	//	int [] result = indices(arr, 9);
		//System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(indices(arr, 9)));
		System.out.println(Arrays.toString(indices2(arr, 9)));
	}

}
