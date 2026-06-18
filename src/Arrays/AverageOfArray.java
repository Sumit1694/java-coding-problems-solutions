package Arrays;

public class AverageOfArray {

	static float avg(int [] arr)
	{
		int sum = 0;

		for(int i:arr)
		{
			sum += i;
		}

		return (float) sum/arr.length;
	}

	public static void main(String[] args) {

		int [] arr = {10,20,30,40};
		System.out.println(avg(arr));

	}
}