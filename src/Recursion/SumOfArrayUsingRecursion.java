package Recursion;

public class SumOfArrayUsingRecursion {

	static int sumOfArr(int [] arr, int i)
	{
		if(i==arr.length)
		{
			return 0;
		}
		return sumOfArr(arr, i+1) + arr[i];
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4};
		System.out.println(sumOfArr(arr, 0));
	}
}