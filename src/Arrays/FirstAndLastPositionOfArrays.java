package Arrays;

import java.util.Arrays;

public class FirstAndLastPositionOfArrays {

	static int [] firstAndLastPositionElement(int [] arr,int key)
	{
		int [] pos = {-1,-1};
		int l=0,h=arr.length-1;

		while(l<=h)
		{
			int mid = l + (h-l)/2;
			if(arr[mid]==key)
			{
				pos[0] = mid;
				h = mid - 1;
			}
			else if(key<arr[mid])
			{
				h = mid - 1;
			}
			else
			{
				l = mid + 1;
			}
		}

		l=0;h=arr.length-1;

		while(l<=h)
		{
			int mid = l + (h -l)/2;

			if(arr[mid]==key)
			{
				pos[1] = mid;
				l = mid + 1;
			}
			else if(key<arr[mid])
			{
				h = mid - 1;
			}
			else
			{
				l = mid + 1;
			}
		}
		return pos;
	}

	public static void main(String[] args) {

		int [] arr = {3,4,4,4,4,4,4,4,4,6};
		int key = 4;
		System.out.println(Arrays.toString(firstAndLastPositionElement(arr, key)));
	}
}