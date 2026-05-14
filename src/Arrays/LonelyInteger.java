package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LonelyInteger {

	static int lonelyNaiveApproach(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isLonely = true;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					isLonely = false;
					break;
				}
			}

			if(isLonely)
			{
				return arr[i];
			}
		}
		return -1;
	}

	static int loneyInteger1(int [] arr)
	{
		Arrays.sort(arr);

		for(int i=0;i<arr.length-2;i=i+2)
		{
			if(arr[i]!=arr[i+1])
			{
				return arr[i];
			}
		}
		return arr[arr.length-1];
	}

	static int lonelyUsingCollection(int [] arr)
	{
		HashSet<Integer> set = new HashSet<>();

		for(int i=0;i<arr.length;i++)
		{
		    if(set.contains(arr[i]))
		    {
		    	set.remove(arr[i]);
		    }
		    else
		    {
		    	set.add(arr[i]);
		    }
		}

		for(int i:set)
		{
			return i;
		}
		return -1;
	}

	static int lonely2(int [] arr)
	{
		int res = 0;

		for(int i:arr)
		{
			res = res ^ i;
		}
		return res;
	}

	public static void main(String[] args) {

		int [] arr = {5,1,4,4,5,3,1};//1,1,3,3,4,4,5
	 	System.out.println(lonelyNaiveApproach(arr));
	 	System.out.println(loneyInteger1(arr));
	 	System.out.println(lonelyUsingCollection(arr));
	 	System.out.println(lonely2(arr));
	}
}