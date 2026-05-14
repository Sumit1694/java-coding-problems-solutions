package Arrays;

public class CountTillElement {

	static int countTillElement(int [] arr, int key)
	{
		int l=0,h=arr.length-1;
		int mid = 0;

		while(l<=h)
		{
			mid = l + (h-l)/2;

			if(arr[mid]==key)
			{
				if(arr[mid+1]==key && arr[mid+1]<arr.length)
				{
					mid++;
				}
				break;
			}
			else if(arr[mid]>key)
			{
				h = mid - 1;
			}
			else
			{
				l = mid + 1;
			}
		}

		if(arr[mid]>key)
		{
			return mid;
		}
		else
		{
			return mid+1;
		}
	}

	public static void main(String[] args) {

		int [] arr = {2,6,12,24,26,26,27,30};
		int key = 6;
		int n = countTillElement(arr , key);
        System.out.println(n);
	}
}