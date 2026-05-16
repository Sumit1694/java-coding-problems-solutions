package Arrays;

public class PrintUniqueValuesFromArray {

	static void unique(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean found = false;

			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					found = true;
					break;
				}
			}

			if(!found)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,2,2,3,1,4};
		unique(arr);
	}
}