package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsInSortedArray {

	static void frequencyNaiveApproach(int [] arr)
	{
		int count = 1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i-1] + " " + count);
				count = 1;
			}
		}
		System.out.println(arr[arr.length-1] + " " + count);
	}

	static void frequency1(int [] arr)
	{
		int freq = 1;
		int i = 1;

		while(i<arr.length)
		{
			while(i<arr.length && arr[i]==arr[i-1])
			{
				freq++;
				i++;
			}
			System.out.println(arr[i-1] +" " + freq);
			freq = 1;
			i++;
		}

		if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2])
		{
			System.out.println(arr[i-1] + " " + freq);
		}
	}

	static void frequency2(int [] arr)
	{
		int i=1;
		int count = 1;

		while(i<arr.length)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i-1] + " -> " + count);
				count = 1;
			}
			i++;
		}
		System.out.println(arr[arr.length-1] + " -> " + count);
	}

	static void frequency3(int [] arr)
	{
		boolean visited [] = new boolean[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			int count = 1;

			if(visited[i])
			{
				continue;
			}

			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " -> " + count);
		}
	}

	static void frequency4(int [] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey() +" = "+entry.getValue());
		}
	}

	public static void main(String[] args) {

		int [] arr = {20,20,30,30,30,40,40};
		//frequencyNaiveApproach(arr);
		//frequency1(arr);
		//frequency2(arr);
		//frequency3(arr);
		frequency4(arr);
	}

}
