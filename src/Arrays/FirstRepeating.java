package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeating {

	static int firstRepeating(int [] arr)
	{
		Set<Integer> set = new HashSet<>();

		int first = -1;

		for(int i=arr.length-1;i>=0;i--)
		{
			if(set.contains(arr[i]))
			{
				first = arr[i];
			}
			else
			{
				set.add(arr[i]);
			}
		}
		return first;
	}

	public static void main(String[] args) {

		int [] arr = {2,3,4,4,3,5,7};

		System.out.println(firstRepeating(arr));
	}
}