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

	static int [] pr(int [] arr)
	{
		int res [] = new int[arr.length];

		int product = 1;

		for(int i:arr)
		{
			product *= i;
		}

		int index = 0;
		for(int n:arr)
		{
			int div = product/n;

			res[index++] = div;
		}

		return res;
	}

	static int [] pr1(int [] arr)
	{
        int n = arr.length;
        int [] ans = new int[n];
        int prodL = 1;
        int prodR = 1;

        for(int i=n-1;i>=0;i--)
        {
        	ans[i] = prodR;
        	prodR = prodR * arr[i];
        }

        for(int i=0;i<n;i++)
        {
        	ans[i] = ans[i] * prodL;
        	prodL = prodL*arr[i];
        }
        return ans;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4};
		//System.out.println(Arrays.toString(result(arr)));
		//System.out.println(Arrays.toString(pr(arr)));
		System.out.println(Arrays.toString(pr1(arr)));
	}

}
