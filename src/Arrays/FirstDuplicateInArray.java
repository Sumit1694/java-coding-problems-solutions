package Arrays;

public class FirstDuplicateInArray {

	static void firstDuplicate(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isDuplicate = false;

			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					isDuplicate = true;
					break;
				}
			}

			if(isDuplicate)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {4,2,7,8,2,3,7};
		firstDuplicate(arr);
	}

}
