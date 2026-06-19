package Arrays;

public class ProductOfArrayElements {

	static int pr(int [] arr)
	{
		int product = 1;
		
		for(int n:arr)
		{
			product *= n;
		}
		
		return product;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4};
		System.out.println(pr(arr));
	}
	
}
