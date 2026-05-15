package Arrays;

public class LargestEvenInArray {

	static int largestEven(int [] arr)
	{
		int largest = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0 && arr[i]>largest)
			{
				largest = arr[i];
			}
		}

		return (largest==Integer.MIN_VALUE) ? -1 : largest;
	}

	public static void main(String[] args) {

		int [] arr = {11,8, 23, 16, 2, 4, 9};

		System.out.println(largestEven(arr));
	}
}