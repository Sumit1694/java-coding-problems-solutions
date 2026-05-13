package Others;

public class BinarySearchAlgorithm {

	static int binarySearch(int [] arr, int key)
	{
		int l=0, h=arr.length-1;

		while(l<=h)
		{
			int mid = l + (h-l)/2;

			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]<key)
			{
				l = mid + 1;
			}
			else
			{
				h = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String [] args)
	{
		int [] arr = {50,10,33,40,26};
		int key = 40;
		System.out.println(binarySearch(arr, key));
	}

}
