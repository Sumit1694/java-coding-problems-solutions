package Arrays;

public class CeilAndFloor {

	static int Ceil(int [] arr, int key)
	{
        int l=0,h=arr.length-1;

        while(l<=h)
        {
        	int mid = l+(h-l)/2;

        	if(arr[mid]==key)
        	{
        		return arr[mid];
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

        if(l<arr.length)
        {
        	return arr[l];
        }
        else
        {
        	 return -1;
        }
	}

	static int floor(int [] arr, int key)
	{
		int l=0, h=arr.length-1;

		while(l<=h)
		{
			int mid = l + (h-l)/2;

			if(arr[mid]==key)
			{
				return arr[mid];
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

		if(h>=0)
		{
			return arr[h];
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args) {

		int [] arr = {19,23,56,61,72,88,92};
		System.out.println(Ceil(arr, 71));
		System.out.println(floor(arr, 84));

	}

}
