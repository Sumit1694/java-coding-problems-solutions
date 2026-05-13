package Arrays;

public class MissingNumber {

	static int missingNumber(int [] arr)
	{
		int n = arr.length+1;
		int expSum = n *(n+1)/2;
		int actSum = 0;

		for(int i=0;i<arr.length;i++)
		{
			actSum += arr[i];
		}

		return expSum - actSum;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,4,5,6};
		System.out.println(missingNumber(arr));
	}

}
