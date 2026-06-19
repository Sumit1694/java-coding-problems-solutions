package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonsInThreeArrays {

	static List<Integer> commons(int [] a, int [] b, int [] c)
	{
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for(int n:a)
		{
			set1.add(n);
		}

		for(int n:b)
		{
			if(set1.contains(n))
			{
				set2.add(n);
			}
		}

		List<Integer> list = new ArrayList<>();

		for(int n:c)
		{
			if(set2.contains(n))
			{
				list.add(n);
			}
		}

		return list;
	}

	public static void main(String[] args) {

		int [] arr1 = {1,5,10,20};
		int [] arr2 = {1,4,5,20};
		int [] arr3 = {1,5,20,30};
		System.out.println(commons(arr1, arr2,arr3));
	}

}
