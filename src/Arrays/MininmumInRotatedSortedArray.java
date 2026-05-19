package Arrays;

public class MininmumInRotatedSortedArray {

	static int minNaive(int [] arr)
	{
		int min = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	static int minOptimal(int [] arr)
	{
		int l=0,h=arr.length-1;

		while(l<h)
		{
			int mid = l + (h-l)/2;

            if(arr[mid]>arr[h])
            {
            	l = mid + 1;
            }
            else
            {
            	h = mid;
            }
		}
		return arr[l];
	}

	public static void main(String[] args) {

		int [] arr = {3,4,5,1,2};
		System.out.println(minNaive(arr));
		System.out.println(minOptimal(arr));

	}

}
