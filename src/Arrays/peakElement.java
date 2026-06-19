package Arrays;

public class peakElement {

	static int findPeak(int [] arr)
	{
		int n = arr.length;

		if(n==1)
		{
			return arr[0];
		}

		if(arr[0]>arr[1])
		{
			return arr[0];
		}

		if(arr[arr.length-1]>arr[arr.length-2])
		{
			return arr[arr.length-1];
		}

		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				return arr[i];
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {1,3,20,4,1};
		System.out.println(findPeak(arr));
	}

}
