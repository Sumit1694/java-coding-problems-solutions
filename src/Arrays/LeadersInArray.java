package Arrays;

public class LeadersInArray {

	static void leaders(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isLeader = true;

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<=arr[j])
				{
					isLeader = false;
					break;
				}
			}
			if(isLeader)
			{
				System.out.print(arr[i] +" ");
			}
		}
	}

	static void leaders1(int [] arr)
	{
		int curr = arr[arr.length-1];
		System.out.print(curr+" ");

		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>curr)
			{
				curr = arr[i];
                System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {8,11,5,11,7,6,3};
		//leaders(arr);
		leaders1(arr);
	}

}
