package Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	static void removeDuplicateBySet(int [] arr)
	{
		Set<Integer> set = new LinkedHashSet<>();

		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}

		for(int i:set)
		{
			System.out.print(i + " ");
		}
	}

	static void removeDuplicatesBruteForce(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isDuplicate = false;

			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate)
			{
				System.out.print(arr[i] +" ");
			}
		}
	}

	static int removeDuplicatesUnsorted(int [] arr)
	{
		int index = 0;

		for(int i=0;i<arr.length;i++)
		{
            boolean isDuplicate = false;

            for(int j=0;j<index;j++)
            {
            	if(arr[i]==arr[j])
            	{
            		isDuplicate = true;
            		break;
            	}
            }
            if(!isDuplicate)
            {
            	arr[index] = arr[i];
            	index++;
            }
		}

		return index;
	}

	static int removeDuplicateSet(int [] arr)
	{
		Set<Integer> set = new LinkedHashSet<>();

		int index = 0;

		for(int i:arr)
		{
			set.add(i);
		}

		for(int n:set)
		{
			arr[index++] = n;
		}

		return index;
	}

	static int removeDuplicates(int [] arr)
	{
		int rd = 0;

		for(int i=1;i<arr.length;i++)
		{
			if(arr[rd]!=arr[i])
			{
				rd++;
				arr[rd] = arr[i];
			}
		}

		return rd+1;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,2,3,4,4,5};

		/*  int rd = removeDuplicates(arr);

       for(int i=0;i<rd;i++)
       {
    	   System.out.print(arr[i] + " ");
       }
		 */
		//removeDuplicateBySet(arr);
		removeDuplicatesBruteForce(arr);
	}
}