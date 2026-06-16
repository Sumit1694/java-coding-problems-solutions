package Arrays;

public class SortArrayFindMaxAndMin {

	static void sortAndFind(int [] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int min = arr[i];
			int j = i - 1;

			while(j>=0 && arr[j]>min)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = min;
		}

		int min = arr[0];
		int max = arr[arr.length-1];

		System.out.println("Max: " + max +" min: " + min);
	}

	public static void main(String[] args) {

		int [] arr = {5,3,1,6,7,8,6};
		sortAndFind(arr);

	}

}
