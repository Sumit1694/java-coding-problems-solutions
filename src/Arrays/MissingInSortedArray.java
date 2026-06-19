package Arrays;

public class MissingInSortedArray {

	static int missing(int [] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]+1!=arr[i])
			{
				return arr[i]-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,6,7};
        System.out.println(missing(arr));
	}

}
