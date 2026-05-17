package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairsWEqualsSum {

	static void pairs(int [] arr, int sum)
	{
		Arrays.sort(arr);

		int l=0,h=arr.length-1;

		while(l<h)
		{
			if(arr[l]+arr[h]<sum)
			{
				l++;
			}
			else if(arr[l]+arr[h]>sum)
			{
				h--;
			}
			else if(arr[l]+arr[h]==sum)
			{
				System.out.println(arr[l] +", "+arr[h]);
				l++;
				h--;
			}
		}
	}

	static void pairsSum(int [] arr, int sum)
	{
		Set<Integer> set = new HashSet<>();

		for(int num:arr)
		{
			int target = sum - num;

			if(set.contains(target))
			{
				System.out.println(target +", " + num);
			}
			set.add(num);
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,3,7,2,8,5};
		int sum = 10;
		//pairs(arr, sum);
		pairsSum(arr, sum);
	}

}
