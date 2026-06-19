package Arrays;

import java.util.Arrays;

public class SortZerosOnesAndTwos {

	static int [] sortArray(int [] arr)
	{
		int l=0, m=0, h=arr.length-1;

		while(m<h)
		{
			if(arr[m]==0)
			{
				int temp = arr[m];
				arr[m] = arr[l];
				arr[l] = temp;
				l++;
				m++;
			}
			else if(arr[m]==1)
			{
				m++;
			}
			else
			{
				int temp = arr[m];
				arr[m] = arr[h];
				arr[h] = temp;
				h--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int [] arr = {2,0,1,2,1,0};
		System.out.println(Arrays.toString(sortArray(arr)));
	}
}