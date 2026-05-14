package Arrays;

public class IsArraySorted {

	static boolean isSorted(int [] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int [] arr = {2,4,6,8,10,12,14};
		System.out.println(isSorted(arr));
	}

}
