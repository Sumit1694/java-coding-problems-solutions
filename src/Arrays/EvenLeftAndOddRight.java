package Arrays;

import java.util.Arrays;

public class EvenLeftAndOddRight {

	static void moveEvenAndOdd(int [] arr)
	{
		int l=0, h=arr.length-1;

		while(l<=h)
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

	static void moveEvenOrOdd(int [] arr)
	{
		int e = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				int temp = arr[i];
				arr[i] = arr[e];
				arr[e] = temp;
				e++;
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,4,3,8,7,2};
		int [] arr2 = {2, 4, 1, 6};
		moveEvenAndOdd(arr);
		moveEvenOrOdd(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
