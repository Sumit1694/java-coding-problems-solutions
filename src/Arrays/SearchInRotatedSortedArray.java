package Arrays;

public class SearchInRotatedSortedArray {

	static int search(int [] arr, int key)
	{
		int l=0, h=arr.length-1;

		while(l<=h)
		{
			int mid = l+(h-l)/2;

			if(key==arr[mid])
			{
				return mid;
			}
			else if(arr[l]<=arr[mid])
			{
				if(key>=arr[l] && key<arr[mid])
				{
					h = mid - 1;
				}
				else
				{
					l = mid + 1;
				}
			}
			else
			{
				if(key>arr[mid] && key<=arr[h])
				{
					l = mid + 1;
				}
				else
				{
					h = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int [] arr1 = {4,5,6,7,8,1,2};
		int [] arr2 = {7,8,1,2,3,4,5,6};

		System.out.println(search(arr1, 1));
		System.out.println(search(arr2, 7));

	}

}
