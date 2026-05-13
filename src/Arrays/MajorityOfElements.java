package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityOfElements {

	static int majorityElementNaive1(int [] arr)
	{
		int n = arr.length/2;

		for(int i=0;i<arr.length;i++)
		{
			int count = 1;

			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					count++;
				}
			}

			if(count>n)
			{
				return arr[i];
			}
		}
		return -1;
	}

	static int majorityElementNaive2(int [] arr)
	{
		int n = arr.length;
		HashMap<Integer,Integer> map = new HashMap<>();

		for(int num:arr)
		{
            map.put(num, map.getOrDefault(num, 0)+1);
		}

		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>n/2)
			{
				return entry.getKey();
			}
		}
		return -1;
	}

	static int majorityElementOptimized3(int [] arr)
	{
		int maj = arr[0], votes = 1;

		for(int i=1;i<arr.length;i++)
		{
			if(votes==0)
			{
				votes++;
				maj = arr[i];
			}
			else if(maj==arr[i])
			{
				votes++;
			}
			else
			{
				votes--;
			}
		}
		return maj;
	}

	public static void main(String[] args) {

		int [] arr = {3,3,4,2,3,3,3};
		System.out.println(majorityElementOptimized3(arr));
	}
}