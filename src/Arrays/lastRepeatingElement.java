package Arrays;

public class lastRepeatingElement {

	static int lastRepeatingEle(int [] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {1,3,4,3,2,1};
		System.out.println(lastRepeatingEle(arr));

	}

}
