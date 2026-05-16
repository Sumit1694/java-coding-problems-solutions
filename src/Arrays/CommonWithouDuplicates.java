package Arrays;

public class CommonWithouDuplicates {

	public static void main(String[] args) {

		int [] arr1 = {1,2,2,3,4};
		int [] arr2 = {2,2,3,3,5};

		int i=0,j=0;

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.print(arr1[i] +" ");
				i++;
				j++;

				while(i<arr1.length && arr1[i]==arr1[i-1]) i++;
				while(j<arr2.length && arr2[j]==arr2[j-1]) j++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
	}
}