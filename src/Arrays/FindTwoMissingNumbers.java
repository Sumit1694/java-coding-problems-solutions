package Arrays;

import java.util.Arrays;

public class FindTwoMissingNumbers {

	static int [] twoMissing(int [] arr)
	{
		int result [] = new int[2];
		int index = 0;

		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1] != arr[i]+1)
			{
		        result[index++] = arr[i]+1;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,4,6};
		System.out.println(Arrays.toString(twoMissing(arr)));
	}

}
