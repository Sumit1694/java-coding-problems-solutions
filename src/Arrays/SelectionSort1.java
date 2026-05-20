package Arrays;

import java.util.Arrays;

public class SelectionSort1 {

	static void selectionSort(int [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}

			if(min!=i)
			{
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}

		}
	}

	public static void main(String[] args) {

		int [] arr = {7,4,10,8,3,1};
		selectionSort(arr);

		System.out.println(Arrays.toString(arr));

	}

}
