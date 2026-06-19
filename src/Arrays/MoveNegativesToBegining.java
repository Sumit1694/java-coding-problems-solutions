package Arrays;

import java.util.Arrays;

public class MoveNegativesToBegining {

	static int [] moveNegatives(int [] arr)
	{
		int l=0,h=arr.length-1;

		while(l<h)
		{
			if(arr[l]<0)
			{
				l++;
			}
			else if(arr[h]>0)
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

	static int [] moveNegatives1(int [] arr)
	{
		int [] result = new int[arr.length];
        int index = 0;

        for(int n:arr)
        {
        	if(n<0)
        	{
        		result[index++] = n;
        	}
        }

        for(int n:arr)
        {
        	if(n>=0)
        	{
        		result[index++] = n;
        	}
        }

        return result;
	}



	public static void main(String[] args) {

		int [] arr = {1, -2, 3, -4, 5, -6};
        //System.out.println(Arrays.toString(moveNegatives(arr)));
	    System.out.println(Arrays.toString(moveNegatives1(arr)));


	}

}
