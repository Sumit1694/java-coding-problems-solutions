package Arrays;

import java.util.Arrays;

public class ProductOfAnArrayExceptSelf {

	static int [] result(int [] arr)
	{
		int [] res = new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			int product = 1;

			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					product *= arr[j];
				}
			}

			res[i] = product;
		}

		return res;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4};
		System.out.println(Arrays.toString(result(arr)));

	}

}
