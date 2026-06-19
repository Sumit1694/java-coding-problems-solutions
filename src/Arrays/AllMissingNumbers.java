package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {

	static List<Integer> allMissing(int [] arr)
	{
		List<Integer> list = new ArrayList<>();

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]!=arr[i]+1)
			{
				list.add(arr[i]+1);
			}
		}

		return list;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,4,6,8};
		System.out.println(allMissing(arr));

	}

}
