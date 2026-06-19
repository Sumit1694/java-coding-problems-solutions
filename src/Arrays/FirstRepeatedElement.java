package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatedElement {

	static void firstRepeated(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;

			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}

			if(count>1)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

	static int firstRepeatedUsingSet(int [] arr)
	{
		Set<Integer> set = new HashSet<>();

		for(int n:arr)
		{
			if(!set.add(n))
			{
				if(set.contains(n))
				{
					return n;
				}
			}
		}
		return -1;
	}

	static void firstRepeatedUsingMap(int [] arr)
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
				System.out.println(entry.getKey());
				break;
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,2,5};
        firstRepeated(arr);
        System.out.println(firstRepeatedUsingSet(arr));
        firstRepeatedUsingMap(arr);

	}

}
