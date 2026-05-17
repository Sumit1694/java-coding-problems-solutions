package Arrays;

import java.util.Arrays;

public class SeperateEvenOdd {

	static void seprate(int [] arr)
	{
		int l=0, h=arr.length-1;

		while(l<h)
		{
			if(arr[l]%2==0)
			{
				l++;
			}
			else if(arr[h]%2!=0)
			{
				h--;
			}
			else
			{
				int temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
				l++;
				h--;
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,6,3,8,5,10};

		seprate(arr);

		System.out.println(Arrays.toString(arr));

	}

}
