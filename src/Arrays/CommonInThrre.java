package Arrays;

public class CommonInThrre {

	public static void main(String[] args) {

		int [] arr1 = {1,2,3,4};
		int [] arr2 = {2,3,5,6};
		int [] arr3 = {2,3,7,8};

		int i=0,j=0,k=0;

		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
			{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<=arr2[j] && arr1[j]<=arr3[k])
			{
				i++;
			}
			else if(arr2[j]<=arr1[i] && arr2[j]<=arr3[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
	}
}
