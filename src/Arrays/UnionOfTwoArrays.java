package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

	static Set<Integer> union(int [] arr1, int [] arr2)
	{
        Set<Integer>set = new HashSet<>();

        for(int n:arr1)
        {
        	set.add(n);
        }

        for(int n:arr2)
        {
        	set.add(n);
        }

       return set;
	}

	static void union1(int [] arr1, int [] arr2)
	{
		int i=0,j=0;

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
                System.out.print(arr1[i]+" ");
                i++;
			}
			else if(arr1[i]>arr2[j])
			{
				System.out.print(arr2[i]+" ");
				j++;
			}
			else
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}

		while(i<arr1.length)
		{
			System.out.print(arr1[i]+" ");
			i++;
		}

		while(j<arr2.length)
		{
			System.out.print(arr2[j] +" ");
			j++;
		}
	}

	public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {3,4,5};
        System.out.println(union(arr1,arr2));
        union1(arr1,arr2);
        System.out.println();
        union1(arr1, arr2);
	}
}