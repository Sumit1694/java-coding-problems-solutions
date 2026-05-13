package Arrays;

public class FindPairsWithGivenSum {

	static void pairs(int [] arr, int target)
	{
		int l=0, h=arr.length-1;

		while(l<h)
		{
			if(arr[l]+arr[h]>target)
			{
				h--;
			}
			else if(arr[l]+arr[h]<target)
			{
				l++;
			}
			else if(arr[l]+arr[h]==target)
			{
				System.out.println("Pair (" +arr[l] + " , " + arr[h] + ") ");
			    l++;
			    h--;
			}
		}
	}

	public static void main(String[] args) {

		int [] arr = {2, 7, 11, 15};
		int target = 9;
		pairs(arr, target);
	}
}
