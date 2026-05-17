package Arrays;

public class OddOccurance {

	static int findOdd(int [] arr)
	{
		int result = 0;

		for(int n:arr)
		{
			result = result ^ n;
		}
		return result;
	}

	static int findOdd1(int [] arr)
	{
		int count = 0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}

			if(count%2!=0)
			{
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,2,1,3,3};
		System.out.println(findOdd(arr));
		System.out.println(findOdd1(arr));
	}
}