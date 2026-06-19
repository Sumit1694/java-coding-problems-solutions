package Arrays;

import java.util.Arrays;

public class SortArrayZerosAndOnes {

	static int [] sortArray(int [] arr)
	{
        int l=0, h=arr.length-1;

        while(l<h)
        {
        	if(arr[l]==0)
        	{
        		l++;
        	}
        	else if(arr[h]==1)
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

        return arr;
	}

	static int [] sortArr(int [] arr)
	{
		int zeroCount = 0;

		for(int i:arr)
		{
			if(i==0)
			{
				zeroCount++;
			}
		}

		for(int i=0;i<zeroCount;i++)
		{
			arr[i] = 0;
		}

		for(int i=zeroCount;i<arr.length;i++)
		{
			arr[i] = 1;
		}

		return arr;
	}

	public static void main(String[] args) {

		int [] arr = {1,0,1,0,0,1};
        System.out.println(Arrays.toString(sortArray(arr)));
        System.out.println(Arrays.toString(sortArr(arr)));
	}
}