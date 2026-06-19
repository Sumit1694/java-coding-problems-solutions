package Arrays;

import java.util.HashSet;
import java.util.Set;

public class MissingPositiveInteger {

	static int missingPositive(int [] arr)
	{
		Set<Integer> set = new HashSet<>();

		for(int n:arr)
		{
			if(n>0)
			{
				set.add(n);
			}
		}

		int missing = 1;

		while(true)
		{
			if(!set.contains(missing))
			{
				return missing;
			}
			missing++;
		}
	}

	public static void main(String[] args) {

		int [] arr = {3,4,-1,1};
		System.out.println(missingPositive(arr));

	}

}
