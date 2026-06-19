package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicates {

	static List<Integer> allDps(int [] arr)
	{
		List<Integer> list = new ArrayList<>();

		Arrays.sort(arr);

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]==arr[i])
			{
				list.add(arr[i]);
			}
		}

		return list;
	}

	static List<Integer> allDps1(int [] arr)
	{
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		for(int i=0;i<arr.length-1;i++)
		{
			if(!set.add(arr[i]))
			{
				list.add(arr[i]);
			}
		}

		return list;
	}



	public static void main(String[] args) {

		int [] arr = {1,2,3,2,4,1,5};
		System.out.println(allDps(arr));
		System.out.println(allDps1(arr));
	}
}
