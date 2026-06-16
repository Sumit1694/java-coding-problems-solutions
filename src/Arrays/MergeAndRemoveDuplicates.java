package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeAndRemoveDuplicates {

	static void mergeAndRemoveDuplicates(int [] arr1,int [] arr2)
	{
		int i=0,j=0,k=0;

		int merge[] = new int[arr1.length+arr2.length];

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				merge[k] = arr1[i];
				i++;
			}
			else
			{
				merge[k] = arr2[j];
				j++;
			}
			k++;
		}

		while(i<arr1.length)
		{
			merge[k] = arr1[i];
			k++;
			i++;
		}

		while(j<arr2.length)
		{
			merge[k] = arr2[j];
			k++;
			j++;
		}

		int rd = 0;

		for(int p=1;p<k;p++)
		{
			if(merge[rd]!=merge[p])
			{
				rd++;
				merge[rd] = merge[p];
			}
		}

		for(int g=0;g<=rd;g++)
		{
			System.out.print(merge[g] +" ");
		}
	}

	static int [] mergeUnique(int [] arr1, int [] arr2)
	{
		Set<Integer> set = new HashSet<>();

		for(int num:arr1)
		{
			set.add(num);
		}

		for(int num:arr2)
		{
			set.add(num);
		}

		int [] result = new int[set.size()];

		int i=0;

		for(int n:set)
		{
			result[i] = n;
			i++;
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr1={1,2,3,4};
        int[] arr2={3,4,5,6};

        mergeAndRemoveDuplicates(arr1,arr2);
        System.out.println();
        System.out.println(Arrays.toString(mergeUnique(arr1,arr2)));
	}

}
