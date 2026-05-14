package Arrays;


public class MedianOfTwoSortedArrays {

	static float median(int [] arr1, int [] arr2)
	{
		int i=0,j=0,k=0;

		int [] m = new int[arr1.length + arr2.length];

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				m[k] = arr1[i];
				i++;
			}
			else
			{
				m[k] = arr2[j];
				j++;
			}
			k++;
		}

		while(i<arr1.length)
		{
			m[k] = arr1[i];
			i++;
			k++;
		}

		while(j<arr2.length)
		{
			m[k] = arr2[j];
			j++;
			k++;
		}

		if(m.length%2==0)
		{
			int mid = m.length/2;
			return (float)(m[mid]+m[mid-1])/2;
		}
		else
		{
			int mid = m.length/2;
			return m[mid];
		}

	}

	public static void main(String[] args) {

		int [] arr1 = {1,3,8,17};
		int [] arr2 = {5,6,7,19,21,25};
        System.out.println(median(arr1,arr2));
	}

}
