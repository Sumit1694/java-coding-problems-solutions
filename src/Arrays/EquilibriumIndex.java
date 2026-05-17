package Arrays;

//Left sum = right sum

public class EquilibriumIndex {

	static int eIndex(int [] arr)
	{
		int totalSum = 0;

		for(int i:arr)
		{
		   totalSum += i;
		}

		int leftSum = 0;

		for(int i=0;i<arr.length;i++)
		{
			totalSum = totalSum - arr[i];

			if(leftSum == totalSum)
			{
				return i;
			}

			leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {1, 3, 5, 2, 2};
		System.out.println(eIndex(arr));
	}
}