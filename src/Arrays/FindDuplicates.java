package Arrays;

import java.util.*;

public class FindDuplicates {

	static void duplicates(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isDuplicate = false;

			for(int k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					isDuplicate = true;
					break;
				}
			}

			if(isDuplicate)
			{
				continue;
			}

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
	}

	static void duplicates1(int [] arr)
	{
        Set<Integer> set = new HashSet<>();

        for(int n:arr)
        {
        	if(!set.add(n))
        	{
        		if(set.contains(n))
        		{
        			System.out.print(n +" ");
        		}
        	}
        }
	}

	static void duplicates2(int [] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int n:arr)
		{
			map.put(n, map.getOrDefault(n, 0)+1);
		}

		for(Map.Entry<Integer, Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.print(entry.getKey() +" ");
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,2,4,1};
		duplicates(arr);
		System.out.println();
		duplicates1(arr);
		System.out.println();
		duplicates2(arr);
	}
}