package Arrays;

public class RepeatingValuesOnlyOnce {

	static void repeatedValuesonlyOnce(int [] arr)
	{
		boolean [] visited = new boolean[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			boolean found = false;

			if(visited[i])
			{
				continue;
			}

			for (int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
                    found = true;
                    visited[j] = true;
				}
			}

			if(found)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {1,2,2,2,3,4,4};
		repeatedValuesonlyOnce(arr);

	}

}
