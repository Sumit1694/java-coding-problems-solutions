package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CommonWithFrequency {

	public static void main(String[] args) {

		int [] arr1 = {1,2,2,3};
		int [] arr2 = {2,2,3,3};

		Map<Integer,Integer> map1 = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();

		for(int n:arr1)
		{
			map1.put(n, map1.getOrDefault(n, 0)+1);
		}

		for(int n:arr2)
		{
			map2.put(n, map2.getOrDefault(n, 0)+1);
		}

		for(int key:map1.keySet())
		{
			if(map2.containsKey(key))
			{
				int count = Math.min(map1.get(key), map2.get(key));

				System.out.println(key +" -> " + count + " times");
			}
		}
	}
}