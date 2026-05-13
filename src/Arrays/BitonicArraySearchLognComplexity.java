package Arrays;

public class BitonicArraySearchLognComplexity {

	static int ascendingBinarySearch(int [] arr, int key, int l,int h)
	{
		while(l<=h)
		{
			int mid = l+(h-l)/2;

			if(arr[mid]==key)
			{
				return mid;
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
		return -1;
	}

	static int descnedingBinarySearch(int [] arr, int key, int l,int h)
	{
		while(l<=h)
		{
			int mid = l + (h-l)/2;

			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key<arr[mid])
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

	static int findBitonicPoint(int [] arr)
	{
		int l=0,h=arr.length-1;

		while(l<=h)
		{
			int mid = l + (h-l)/2;

            if(mid>0 && mid<arr.length-1)
            {
            	if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            	{
            		return mid;
            	}
            	else if(arr[mid]<arr[mid+1])
            	{
            		l = mid + 1;
            	}
            	else
            	{
            		h = mid - 1;
            	}
            }
            else
            {
            	break;
            }
		}
		return -1;
	}

	static int searchInBitonicArray(int [] arr, int key)
	{
		int bIndex = findBitonicPoint(arr);

		if(bIndex==-1)
		{
			return -1;
		}

		if(arr[bIndex]==key)
		{
			return bIndex;
		}

		int res1 = ascendingBinarySearch(arr, key, 0, bIndex-1);
		if(res1!=-1)
		{
			return res1;
		}

		return descnedingBinarySearch(arr, key, bIndex+1, arr.length-1);

	}

	public static void main(String[] args) {

		int [] arr = {5,6,7,8,9,10,3,2,1};
        int key = 6;

        System.out.println(searchInBitonicArray(arr, key));
	}

}
