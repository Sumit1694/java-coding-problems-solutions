package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateUsingMap {

	static void countDuplicates(int [] arr)
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
				System.out.println(entry.getKey() +" -> " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,3,2,1,4,3,2,4};
		countDuplicates(arr);
	}
}