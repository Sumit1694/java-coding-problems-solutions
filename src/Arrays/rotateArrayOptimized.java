package Arrays;

import java.util.Arrays;

public class rotateArrayOptimized {

	static void reverse(int [] arr, int l, int h)
	{
		while(l<h)
		{
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
	}

	static void rotate(int [] arr, int k)
	{
		k = k%arr.length;
		if(k<0)
		{
			k = k+arr.length;
		}

		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};

		rotate(arr, -3);

		System.out.println(Arrays.toString(arr));

	}

}
