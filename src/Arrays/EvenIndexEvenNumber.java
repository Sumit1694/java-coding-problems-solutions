package Arrays;

import java.util.Arrays;

public class EvenIndexEvenNumber {

	static int [] rearrange(int [] arr)
	{
        int [] result = new int[arr.length];

        int evenIndex = 0;
        int oddIndex = 1;

        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2==0)
        	{
        		result[evenIndex] = arr[i];
        		evenIndex+=2;
        	}
        	else
        	{
        		result[oddIndex] = arr[i];
        		oddIndex+=2;
        	}
        }
        return result;
	}

	public static void main(String[] args) {

		int [] arr1 = {2,5,8,7,6,9};
		int [] arr2 = {3,2,6,5,8,7};
		System.out.println(Arrays.toString(rearrange(arr1)));
		System.out.println(Arrays.toString(rearrange(arr2)));
	}
}