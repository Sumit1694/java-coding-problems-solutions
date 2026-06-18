package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedElement {

	static void firstNonRepeted(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isDuplicate = false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					isDuplicate = true;
					break;
				}
			}

			if(!isDuplicate)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

	static void firstNonRepeatedUsingMap(int [] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int n:arr)
		{
			map.put(n, map.getOrDefault(n, 0)+1);
		}

		for(Map.Entry<Integer, Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				return;
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,2,1,4};
		firstNonRepeted(arr);
		firstNonRepeatedUsingMap(arr);

	}

}
