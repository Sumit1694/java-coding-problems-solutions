package Arrays;

public class SumOfAllElements {

	static int sumOfArray(int [] arr)
	{
		int sum = 0;

		for(int n:arr)
		{
			sum += n;
		}
		return sum;
	}

	static int sumOfArray2(int [] arr)
	{
		int sum = 0;

		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		System.out.println(sumOfArray(arr));
		System.out.println(sumOfArray2(arr));

	}

}
