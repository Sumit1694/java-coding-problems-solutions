package Arrays;

import java.util.Arrays;

public class SortOnlyNegativeNumbers {

	static void sortOnlyNegatives(int [] arr)
	{
		int count = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}

		int [] neg = new int[count];
		int k = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				neg[k++] = arr[i];
			}
		}

		for(int i=0;i<neg.length-1;i++)
		{
			for(int j=0;j<neg.length-i-1;j++)
			{
				if(neg[j]<neg[j+1])
				{
					int temp = neg[j];
					neg[j] = neg[j+1];
					neg[j+1] = temp;
				}
			}
		}

		k = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i] = neg[k++];
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {-2,5,-1,8,-7,10};
		sortOnlyNegatives(arr);

		System.out.println(Arrays.toString(arr));
	}
}