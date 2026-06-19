package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ElementsPresentInFirstArrayButNotInSecond {

	static void present(int [] arr1, int [] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			boolean isDuplicate = false;

			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					isDuplicate = true;
					break;
				}
			}

			if(!isDuplicate)
			{
				System.out.print(arr1[i] +" ");
			}
		}
	}

	static void presentUsingSet(int [] arr1, int [] arr2)
	{
		Set<Integer> set = new HashSet<>();

		for(int n:arr2)
		{
			set.add(n);
		}

		for(int n:arr1)
		{
			if(!set.contains(n))
			{
				System.out.print(n +" ");
			}
		}
	}

	public static void main(String[] args) {

		int [] arr1 = {1,2,3,4};
		int [] arr2 = {3,4};
        present(arr1, arr2);
        presentUsingSet(arr1, arr2);
	}
}