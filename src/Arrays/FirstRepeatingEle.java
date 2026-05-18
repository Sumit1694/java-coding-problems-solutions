package Arrays;

import java.util.HashSet;

public class FirstRepeatingEle {

	static int firstRepeating(int [] arr)
	{
		HashSet<Integer> set = new HashSet<>();

		for(int num:arr)
		{
			if(set.contains(num))
			{
				return num;
			}
			set.add(num);
		}

		return -1;
	}

	static int firstRepeating1(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {5,2,3,2,4,5};
		int n = firstRepeating1(arr);
        System.out.println(n);


	}
}