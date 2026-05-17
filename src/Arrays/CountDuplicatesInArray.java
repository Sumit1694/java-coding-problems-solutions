package Arrays;

public class CountDuplicatesInArray {

	static void countDuplicates(int [] arr)
	{
		boolean [] visited = new boolean[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			int count = 1;

			if(visited[i])
			{
				continue;
			}

			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					count++;
					visited[j] = true;
				}
			}

			if(count>1)
			{
				System.out.println(arr[i] +" -> " + count +" times");
			}
			count = 1;
		}
	}

	static void countDuplicates1(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count = 1;
			boolean isDuplicate = false;

			for(int k=0;k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					isDuplicate = true;
				}
			}

			if(isDuplicate)
			{
				continue;
			}

			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					count++;
				}
			}

			if(count>1)
			{
				System.out.println(arr[i] +" -> " + count +" times");
			}
			count = 1;
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,2,2,3,2,4,4};
		//countDuplicates(arr);
		countDuplicates1(arr);
	}

}
