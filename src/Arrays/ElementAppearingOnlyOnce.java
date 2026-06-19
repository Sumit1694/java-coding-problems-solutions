package Arrays;

import java.util.Arrays;

public class ElementAppearingOnlyOnce {

	static int appeatingOnlyOnce(int [] arr)
	{
		Arrays.sort(arr);

		for(int i=0;i<arr.length-2;i=i+2)
		{
			if(arr[i+1]!=arr[i])
			{
                return arr[i];
			}
		}
       return arr[arr.length-1];
	}

	static int appearingOnlyOnce(int [] arr)
	{
		int res = 0;

		for(int n:arr)
		{
			res ^= n;
		}

		return res;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,2,1}; //1 1 2 2 3
        System.out.println(appeatingOnlyOnce(arr));
        System.out.println(appearingOnlyOnce(arr));
	}

}
