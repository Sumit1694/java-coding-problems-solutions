package Arrays;

import java.util.*;

public class ReverseAnArray {

	static void reverseAnArray(int [] arr)
	{
		int l=0, h=arr.length-1;

		while(l<h)
		{
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
	}

	static void reverseAnArray1(int [] arr)
	{
		int [] newArr = new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			newArr[i] = arr[arr.length-1-i];
		}

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = newArr[i];
		}
	}

	public static void main(String[] args) {

		int [] arr = {10,20,30,40};
		reverseAnArray1(arr);
		System.out.println(Arrays.toString(arr));



	}
}
