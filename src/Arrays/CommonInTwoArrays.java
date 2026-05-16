package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonInTwoArrays {

	static void commons1(int [] arr1, int [] arr2)
	{
		int [] common = new int[arr1.length+arr2.length];
		int i=0, j=0, index=0;

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]>arr2[j])
			{
				j++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]==arr2[j])
			{
				common[index] = arr1[i];
				index++;
				i++;
				j++;
			}
		}

		for(int k=0;k<index;k++)
		{
			System.out.print(common[k]+" ");
		}
	}

	static void commons2(int [] arr1, int [] arr2)
	{
		int i=0, j=0;

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.print(arr1[i] +" ");
				i++;
				j++;

				while(i<arr1.length && arr1[i]==arr2[i-1]) i++;
				while(j<arr2.length && arr1[j]==arr2[j-1]) j++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
	}

	static void commons3(int [] arr1, int [] arr2)
	{
		Set<Integer> set = new HashSet<>();
		Set<Integer> common = new HashSet<>();

		for(int n:arr1)
		{
			set.add(n);
		}

		for(int n:arr2)
		{
			if(set.contains(n))
			{
				common.add(n);
			}
		}
		System.out.println(common);
	}

	public static void main(String[] args) {

		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {3,4,5,6,7};
		//commons2(arr1, arr2);
		commons3(arr1, arr2);


	}

}
