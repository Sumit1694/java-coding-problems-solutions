package Arrays;

import java.util.Arrays;

//index is stored at the position of element
public class InverseOfAnArray {

	static int [] inverse(int [] arr)
	{
		int [] b = new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			int value = arr[i];
			b[value] = i;
		}
		return b;
	}

	public static void main(String[] args) {

		int [] arr = {2,3,1,0,4};
		System.out.println("Before: " + Arrays.toString(arr));

		System.out.println("After: " + Arrays.toString(inverse(arr)));

	}

}
