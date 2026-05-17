package Arrays;

public class MoveZerosToStart {

	static void move1(int [] arr)
	{
		int pos = arr.length-1;

		for(int i=arr.length-1;i>=0;i--)
		{
	        if(arr[i]!=0)
	        {
	        	arr[pos] = arr[i];
	        	pos--;
	        }
		}

		while(pos>=0)
		{
			arr[pos] = 0;
			pos--;
		}
	}

	static void move2(int [] arr)
	{
		int nz=arr.length-1;
		int z=arr.length-1;

		while(nz>=0)
		{
			if(arr[nz]!=0)
			{
				int temp = arr[nz];
				arr[nz] = arr[z];
				arr[z] = temp;
				nz--;
				z--;
			}
			else
			{
				nz--;
			}
		}
	}

	static void move3(int [] arr)
	{
		int l=0,h=arr.length-1;

		while(l<=h)
		{
			if(arr[l]==0)
			{
				l++;
			}
			else if(arr[h]!=0)
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
	}

	public static void main(String[] args) {

		int [] arr = {0,1,10,0,3};

		//move1(arr);
		//move2(arr);
		move3(arr);

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}

	}

}
