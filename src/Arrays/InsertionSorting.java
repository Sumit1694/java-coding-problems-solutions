package Arrays;

import java.util.Arrays;

public class InsertionSorting {

	static void InsersionSorting(int [] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp = arr[i];
			int j = i-1;

			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {

		int [] arr = {5,4,10,1,6,2};
		InsersionSorting(arr);
		System.out.println(Arrays.toString(arr));
	}
}