package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionOfTwoArrays {

	static void intersection(int [] arr1, int [] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i] +" ");
					break;
				}
			}
		}
	}

	static void intersection1(int [] arr1, int [] arr2)
	{
		Set<Integer> set = new HashSet<>();

		for(int n:arr1)
		{
			set.add(n);
		}

		for(int n:arr2)
		{
			if(set.contains(n))
			{
				System.out.print(n +" ");
			}
		}
	}

	static void intersection2(int [] arr1, int [] arr2)
	{
		int i=0,j=0;

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
	}


	public static void main(String[] args) {

		int [] arr1 = {1,2,3,4};
		int [] arr2 = {3,4,5,6};
        intersection(arr1, arr2);
        intersection1(arr1, arr2);
        intersection2(arr1,arr2);
	}

}
