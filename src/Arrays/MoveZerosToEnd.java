package Arrays;

public class MoveZerosToEnd {

	static void moveUsingIndex(int [] arr)
	{
		int pos = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[pos] = arr[i];
				pos++;
			}
		}

		while(pos<arr.length)
		{
			arr[pos] = 0;
			pos++;
		}

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

	static void moveByTwoPointers(int [] arr)//Not maintaining order of elements
	{
		int l=0, h=arr.length-1;

		while(l<=h)
		{
			if(arr[l]!=0)
			{
				l++;
			}
			else if(arr[h]==0)
			{
				h--;
			}
			else
			{
				int temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
				l++;
				h--;
			}
		}

		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}

    static void moveZerosWithOrder(int [] arr)
    {
    	int nz=0;
    	int z=0;

    	while(nz<arr.length)
    	{
    		if(arr[nz]!=0)
    		{
    			int temp = arr[nz];
    			arr[nz] = arr[z];
    			arr[z] = temp;
    			z++;
    		}
    		else
    		{
    			nz++;
    		}
    	}

    	for(int i:arr)
		{
			System.out.print(i + " ");
		}
    }

	public static void main(String[] args) {

		int [] arr = {0,1,0,3,12};
		//moveUsingIndex(arr);
		//moveByTwoPointers(arr);
		moveZerosWithOrder(arr);
	}
}
