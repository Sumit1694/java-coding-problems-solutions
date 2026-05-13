package Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestConsecutiveSequence {

	static boolean search(int [] arr, int target)
	{
		for(int num:arr)
		{
			if(num==target)
			{
				return true;
			}
		}
		return false;
	}

	static int longestConsecutive(int [] arr)
	{
		int longest = 0;

		for(int i=0;i<arr.length;i++)
		{
			int currentNum = arr[i];
			int count = 1;

			while(search(arr, currentNum+1))
			{
				currentNum++;
				count++;
			}

			longest = Math.max(longest, count);
		}
		return longest;
	}

	static int longestConsecutiveSequence(int [] arr)
	{
		HashSet<Integer> set = new LinkedHashSet<>();
		
		for(int n:arr)
		{
			set.add(n);
		}
		
		int longest = 0;
		
		for(int num:set)
		{
			if(!set.contains(num-1))
			{
				int currentNum = num;
				int count = 1;
				
				while(set.contains(currentNum +1))
				{
					currentNum++;
					count++;
				}
				
				longest = Math.max(count, longest);
			}
		}
		return longest;
	}

	public static void main(String[] args) {

		int [] arr = {100,4,200,1,3,2};
		//System.out.println(longestConsecutive(arr));
		System.out.println(longestConsecutiveSequence(arr));

	}

}
