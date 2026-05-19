package Arrays;

public class InsertOfAnElementInArray {

	int count = 0;

	public static void main(String[] args) {

		InsertOfAnElementInArray o = new InsertOfAnElementInArray();

		int [] arr = new int[5];

		for(int j=0;j<arr.length;j++)
		{
			o.insert(arr, j+1);
		}

		o.insertAtStart(arr, 34);
		o.insertAtStart(arr, 56);
		o.insertAtPosition(arr, 20, 2);

        o.print(arr);

	}

	public void insert(int [] arr, int val)
	{
        arr[count++] = val;
	}

	public void insertAtPosition(int [] arr, int val, int pos)
	{
		for(int i=count-1;i>pos;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[pos] = val;
	}

	public void insertAtStart(int [] arr, int val)
	{
		for(int i=count-1;i>0;i--)
		{
			arr[i] = arr[i-1];
		}

		arr[0] = val;
	}

	public void print(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
