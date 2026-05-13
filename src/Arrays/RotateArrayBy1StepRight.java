package Arrays;

public class RotateArrayBy1StepRight {

	static void rotateOneByRight(int [] arr)
	{
		int last = arr[arr.length-1];

		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1] = arr[i];
		}

		arr[0] = last;

		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};

		rotateOneByRight(arr);
	}

}
