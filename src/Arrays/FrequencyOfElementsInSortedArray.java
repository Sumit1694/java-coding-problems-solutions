package Arrays;

public class FrequencyOfElementsInSortedArray {

	static void frequencyNaiveApproach(int [] arr)
	{
		int count = 1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i-1] + " " + count);
				count = 1;
			}
		}
		System.out.println(arr[arr.length-1] + " " + count);
	}

	static void frequency1(int [] arr)
	{
		int freq = 1;
		int i = 1;

		while(i<arr.length)
		{
			while(i<arr.length && arr[i]==arr[i-1])
			{
				freq++;
				i++;
			}
			System.out.println(arr[i-1] +" " + freq);
			freq = 1;
			i++;
		}

		if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2])
		{
			System.out.println(arr[i-1] + " " + freq);
		}
	}

	static void frequency2(int [] arr)
	{
		int i=1;
		int count = 1;

		while(i<arr.length)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i-1] + " -> " + count);
				count = 1;
			}
			i++;
		}
		System.out.println(arr[arr.length-1] + " -> " + count);
	}

	public static void main(String[] args) {

		int [] arr = {20,20,30,30,30,40,40};
		//frequencyNaiveApproach(arr);
		//frequency1(arr);
		frequency2(arr);
	}

}
