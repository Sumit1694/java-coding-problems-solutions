package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicates {

	static boolean containsDuplicate(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					return true;
				}
			}
		}
		return false;
	}

	static boolean containsDuplicate1(int [] arr)
	{
		Arrays.sort(arr);

		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				return true;
			}
		}
		return false;
	}

	static boolean containsDuplicate2(int [] arr)
	{
		HashSet<Integer> set = new HashSet<>();

		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				return true;
			}
			else
			{
				set.add(arr[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,1};
		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicate1(arr));
		System.out.println(containsDuplicate2(arr));

	}

}
